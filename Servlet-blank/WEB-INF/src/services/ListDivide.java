package services;

import java.util.List;
import java.util.ArrayList;

import model.CustomerInfo;

public class ListDivide {
        
    public static List<List<CustomerInfo>> dividedListAccount(List<CustomerInfo> listAccount) {
        List<List<CustomerInfo>> subLists = new ArrayList<>();
        if (listAccount.size() > 15) {
            final int batchSize = 15;
            for (int i = 0; i < listAccount.size(); i += batchSize) {
                int endIndex = Math.min(i + batchSize, listAccount.size());
                subLists.add(new ArrayList<>(listAccount.subList(i, endIndex)));
            }
        } else {
            subLists.add(listAccount);
        }

        return subLists;
    }
}
