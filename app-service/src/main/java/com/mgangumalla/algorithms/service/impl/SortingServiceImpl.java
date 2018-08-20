package com.mgangumalla.algorithms.service.impl;

import static jdk.nashorn.internal.runtime.JSType.toLong;
import static org.apache.log4j.Logger.getLogger;

import com.mgangumalla.algorithms.service.SortingService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class SortingServiceImpl implements SortingService {
    private static final Logger logger = getLogger(SortingServiceImpl.class);

    @Override
    public long[] selectionSort(String elements) {
        if (elements == null || elements.isEmpty()) {
            throw new IllegalArgumentException("elements list is null or empty");
        }
        logger.debug("elements for sorting are: " + elements);

        String[] ele = elements.split(",");

        int len = ele.length;
        long[] lele = new long[len];

        for (int i = 0; i < len; i ++) {
            lele[i] = toLong(ele[i]);
        }
        logger.debug("elements List: " + lele);
        for (int j = 0; j < len - 1; j++) {
            int iMin = j;

            for (int i = j + 1; i < len; i++) {
                if (lele[i] < lele[iMin]) {
                    iMin = i;
                }
            }

            if (iMin != j) {
                logger.debug("Swapping: [" + lele[j] + " ," + lele[iMin] + "]");
                long swap = lele[j];
                lele[j] = lele[iMin];
                lele[iMin] = swap;
            }
        }

        logger.debug("sorted element List is: " + lele);
        return lele;
    }

    @Override
    public ArrayList<Long> bubbleSort(String elements) {
        return null;
    }

    @Override
    public ArrayList<Long> quickSort(String elements) {
        return null;
    }

    @Override
    public ArrayList<Long> mergeSort(String elements) {
        return null;
    }

    @Override
    public ArrayList<Long> heapSort(String elements) {
        return null;
    }
}
