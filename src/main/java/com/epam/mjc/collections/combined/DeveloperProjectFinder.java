package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> matchingProjects = new ArrayList<>();

        for (Map.Entry<String, Set<String>> entry : projects.entrySet()) {
            String projectName = entry.getKey();
            Set<String> developers = entry.getValue();

            if (developers.contains(developer)) {
                matchingProjects.add(projectName);
            }
        }

        matchingProjects.sort((p1, p2) -> {
            if (p1.length() != p2.length()) {
                return Integer.compare(p2.length(), p1.length());
            }
            return p2.compareTo(p1);
        });

        return matchingProjects;
    }
}
