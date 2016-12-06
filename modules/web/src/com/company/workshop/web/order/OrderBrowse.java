package com.company.workshop.web.order;

import com.company.workshop.entity.Order;
import com.company.workshop.entity.OrderStatus;
import com.haulmont.cuba.gui.components.AbstractLookup;
import com.haulmont.cuba.gui.data.CollectionDatasource;

import javax.inject.Inject;
import java.util.UUID;

public class OrderBrowse extends AbstractLookup {
    @Inject
    private CollectionDatasource<Order, UUID> ordersDs;

    public void onBtnNewStatusClick() {
        Order selected = ordersDs.getItem();
        if (selected != null) {
            selected.setStatus(OrderStatus.NEW);
            ordersDs.commit();
        }
    }
}