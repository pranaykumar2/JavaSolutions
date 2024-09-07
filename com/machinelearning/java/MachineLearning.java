package com.machinelearning.java;

import java.util.*;
import java.util.stream.Collectors;

public class MachineLearning {
    public static void main(String[] args) {
        List<Map<String, Object>> data = loadData();
        visualizeData(data);
        checkAndFillMissingValues(data);
        encodeCategoricalData(data);
        List<Map<String, Object>>[] trainTestSplit = splitTrainTest(data, 0.8);
        List<List<Map<String, Object>>> kFolds = splitKFolds(data, 5);
        featureScaling(data);
    }

    static List<Map<String, Object>> loadData() {
        List<Map<String, Object>> data = new ArrayList<>();
        data.add(createRecord("Liam", 5.6, 85, 25, "Male"));
        data.add(createRecord("Noah", 5.6, 102, 45, "Male"));
        data.add(createRecord("William", 6.1, 94, 65, "Male"));
        data.add(createRecord("James", 5.9, 66, 44, "Male"));
        data.add(createRecord("Oliver", 6.5, 98, 25, "Male"));
        data.add(createRecord("Benjamin", 5.5, 85, 61, "Male"));
        data.add(createRecord("Elijah", 5.2, 12, null, "Male"));
        data.add(createRecord("Lucas", null, 85, 41, "Male"));
        data.add(createRecord("Mason", 5.4, 65, 66, "Male"));
        data.add(createRecord("Amelia", 5.1, 66, 24, "Female"));
        data.add(createRecord("Harper", 4.9, 55, 32, "Female"));
        data.add(createRecord("Evelyn", 5.1, 64, 37, "Female"));
        data.add(createRecord("Abigail", 5.2, 75, null, "Female"));
        return data;
    }

    static Map<String, Object> createRecord(String name, Double height, Integer weight, Integer age, String gender) {
        Map<String, Object> record = new HashMap<>();
        record.put("name", name);
        record.put("height", height);
        record.put("weight", weight);
        record.put("age", age);
        record.put("gender", gender);
        return record;
    }

    static void visualizeData(List<Map<String, Object>> data) {
        data.forEach(System.out::println);
    }

    static void checkAndFillMissingValues(List<Map<String, Object>> data) {
        double meanHeight = data.stream().filter(d -> d.get("height") != null)
                .mapToDouble(d -> (Double) d.get("height")).average().orElse(0.0);
        int medianAge = data.stream().filter(d -> d.get("age") != null)
                .mapToInt(d -> (Integer) d.get("age")).sorted().skip(data.size() / 2).findFirst().orElse(0);

        for (Map<String, Object> record : data) {
            record.putIfAbsent("height", meanHeight);
            record.putIfAbsent("age", medianAge);
        }

    }

    static void encodeCategoricalData(List<Map<String, Object>> data) {
        Map<String, Integer> genderMap = new HashMap<>();
        genderMap.put("Male", 0);
        genderMap.put("Female", 1);

        for (Map<String, Object> record : data) {
            record.put("gender", genderMap.get(record.get("gender")));
        }
    }

    static List<Map<String, Object>>[] splitTrainTest(List<Map<String, Object>> data, double trainSize) {
        Collections.shuffle(data);
        int trainCount = (int) (data.size() * trainSize);
        List<Map<String, Object>> trainSet = data.subList(0, trainCount);
        List<Map<String, Object>> testSet = data.subList(trainCount, data.size());
        return new List[]{trainSet, testSet};
    }

    static List<List<Map<String, Object>>> splitKFolds(List<Map<String, Object>> data, int k) {
        Collections.shuffle(data);
        List<List<Map<String, Object>>> folds = new ArrayList<>();
        int foldSize = data.size() / k;
        for (int i = 0; i < k; i++) {
            folds.add(data.subList(i * foldSize, (i + 1) * foldSize));
        }
        return folds;
    }

    static void featureScaling(List<Map<String, Object>> data) {
        double meanHeight = data.stream().mapToDouble(d -> (Double) d.get("height")).average().orElse(0.0);
        double stdHeight = Math.sqrt(data.stream().mapToDouble(d -> Math.pow((Double) d.get("height") - meanHeight, 2)).average().orElse(0.0));
        double meanWeight = data.stream().mapToDouble(d -> (Integer) d.get("weight")).average().orElse(0.0);
        double stdWeight = Math.sqrt(data.stream().mapToDouble(d -> Math.pow((Integer) d.get("weight") - meanWeight, 2)).average().orElse(0.0));
        double meanAge = data.stream().mapToDouble(d -> (Integer) d.get("age")).average().orElse(0.0);
        double stdAge = Math.sqrt(data.stream().mapToDouble(d -> Math.pow((Integer) d.get("age") - meanAge, 2)).average().orElse(0.0));

        for (Map<String, Object> record : data) {
            record.put("height", ((Double) record.get("height") - meanHeight) / stdHeight);
            record.put("weight", ((Integer) record.get("weight") - meanWeight) / stdWeight);
            record.put("age", ((Integer) record.get("age") - meanAge) / stdAge);
        }
        System.out.println(data);
    }
}