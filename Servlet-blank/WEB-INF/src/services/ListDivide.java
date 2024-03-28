package services;

import java.util.List;
import java.util.ArrayList;

import model.CustomerInfo;

import java.util.List;
import java.util.ArrayList;

public class ListDivide {
        
    public static List<CustomerInfo> getBatchAtIndex(List<CustomerInfo> listAccount, int index) {
        List<CustomerInfo> batch = new ArrayList<>();
        int startIndex = index * 15;
        int endIndex = Math.min(startIndex + 15, listAccount.size());
        
        if (startIndex >= listAccount.size() || startIndex < 0) {
            // Return an empty list if the start index is out of bounds
            return batch;
        }

        for (int i = startIndex; i < endIndex; i++) {
            batch.add(listAccount.get(i));
        }

        return batch;
    }
}

