package com.mgangumalla.algorithms.controller;

import com.mgangumalla.algorithms.service.SortingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class SortingAlgorithmsController {
    @Autowired
    private SortingService sortingService;

    @GetMapping(value = "/selectionSort", produces = "application/json")
    public Map<String, Object> selectionSort(@RequestParam(value = "Elements", required = true) String commaSeparatedElements) {

        Map<String, Object> result = new HashMap<>();
        result.put("timeComplexity", "O(n^2)");
        result.put("desc", new String[]{"IN PSEUDOCODE", "  Repeat until no unsorted elements remain: ",
        "    Search the unsorted part of the data to find the smallest value",
        "    Swap the smallest found value with the first element of the unsorted part"});
        result.put("selectionSort", sortingService.selectionSort(commaSeparatedElements));
        return result;
    }

    @GetMapping(value = "/bubbleSort", produces = "application/json")
    public Map<String, ArrayList<Long>> bubbleSort(@RequestParam(value = "Elements", required = true) String commaSeparatedElements) {

        return Collections.singletonMap("bubbleSort", sortingService.bubbleSort(commaSeparatedElements));
    }

    @GetMapping(value = "/mergeSort", produces = "application/json")
    public Map<String, ArrayList<Long>> mergeSort(@RequestParam(value = "Elements", required = true) String commaSeparatedElements) {

        return Collections.singletonMap("mergeSort", sortingService.mergeSort(commaSeparatedElements));
    }

    @GetMapping(value = "/quickSort", produces = "application/json")
    public Map<String, ArrayList<Long>> quickSort(@RequestParam(value = "Elements", required = true) String commaSeparatedElements) {

        return Collections.singletonMap("quickSort", sortingService.quickSort(commaSeparatedElements));
    }

    @GetMapping(value = "/heapSort", produces = "application/json")
    public Map<String, ArrayList<Long>> heapSort(@RequestParam(value = "Elements", required = true) String commaSeparatedElements) {

        return Collections.singletonMap("heapSort", sortingService.heapSort(commaSeparatedElements));
    }
}
