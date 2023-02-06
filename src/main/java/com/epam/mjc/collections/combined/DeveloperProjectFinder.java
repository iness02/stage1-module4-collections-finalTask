package com.epam.mjc.collections.combined;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        return projects.entrySet().stream()
                .filter(e -> e.getValue().contains(developer))
                .map(Map.Entry::getKey)
                .sorted((p1, p2) -> {
                    int lengthDiff = p2.length() - p1.length();
                    if (lengthDiff != 0) {
                        return lengthDiff;
                    } else {
                        return p2.compareTo(p1);
                    }
                })
                .collect(Collectors.toList());
    }
}
