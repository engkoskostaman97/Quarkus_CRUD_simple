package org.acme;


 
import io.quarkus.hibernate.orm.rest.data.panache.PanacheRepositoryResource;

public interface TicketResourcePanache  extends PanacheRepositoryResource<TicketRepository, Ticket, Long> {
}