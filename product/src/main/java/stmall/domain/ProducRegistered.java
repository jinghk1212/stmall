package stmall.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import stmall.domain.*;
import stmall.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class ProducRegistered extends AbstractEvent {

    private Long id;
    private String productname;
    private Integer stock;

    public ProducRegistered(Inventory aggregate) {
        super(aggregate);
    }

    public ProducRegistered() {
        super();
    }
}
//>>> DDD / Domain Event
