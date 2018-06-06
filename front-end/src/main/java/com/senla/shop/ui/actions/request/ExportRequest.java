package com.senla.shop.ui.actions.request;

import com.senla.shop.main.Client;
import com.senla.shop.ui.actions.IAction;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExportRequest implements IAction {
    @Override
    public void execute() {

        Map<String, List<Object>> request = new HashMap<>();
        request.put("exportReaders", null);
        Client.send(request);
    }
}