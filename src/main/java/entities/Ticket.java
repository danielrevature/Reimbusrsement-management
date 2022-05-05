package entities;

import util.DateTimeZone;

import java.sql.Timestamp;

public class Ticket {
    private int ticket_id;
    private double amount;
    private String description;
    private Timestamp created_at = DateTimeZone.getDateTimeZone();
    private Timestamp updated_at = DateTimeZone.getDateTimeZone();
    private String status = "Pending";
    private String category;

    public Ticket() {}

    public Ticket(double amount, String description, String status, String category) {
        this.amount = amount;
        this.description = description;
        this.status = status;
        this.category = category;
    }

    public Ticket(int ticket_id, double amount, String description, Timestamp created_at, String status, String category) {
        this.ticket_id = ticket_id;
        this.amount = amount;
        this.description = description;
        this.created_at = created_at;
        this.status = status;
        this.category = category;
    }

    public Ticket(int ticket_id, double amount, String description, Timestamp created_at, Timestamp updated_at, String status, String category) {
        this.ticket_id = ticket_id;
        this.amount = amount;
        this.description = description;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.status = status;
        this.category = category;
    }

    public int getTicket_id() {
        return ticket_id;
    }

    public void setTicket_id(int ticket_id) {
        this.ticket_id = ticket_id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Timestamp getCreated_at() {
        return created_at;
    }

    public Timestamp getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Timestamp updated_at) {
        this.updated_at = updated_at;
    }

    public void setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "ticket_id=" + ticket_id +
                ", amount=" + amount +
                ", description='" + description + '\'' +
                ", created_at=" + created_at +
                ", status='" + status + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}