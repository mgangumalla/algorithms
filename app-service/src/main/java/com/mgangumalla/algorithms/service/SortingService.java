package com.mgangumalla.algorithms.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public interface SortingService {

    long[] selectionSort(String elements);

    ArrayList<Long> bubbleSort(String elements);

    ArrayList<Long> quickSort(String elements);

    ArrayList<Long> mergeSort(String elements);

    ArrayList<Long> heapSort(String elements);
}
