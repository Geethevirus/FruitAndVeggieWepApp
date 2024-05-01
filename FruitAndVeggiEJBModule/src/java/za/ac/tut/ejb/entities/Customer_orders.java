/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.ejb.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author Gonts
 */
@Entity
@Table(name="customer_orders_tbl")
public class Customer_orders implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @OneToMany(fetch= FetchType.LAZY, cascade= CascadeType.PERSIST)
    List<LineItems> orderedItems = new ArrayList<>();    
    private Double amount_due;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date creation_time;
    @OneToOne(fetch= FetchType.LAZY, cascade= CascadeType.PERSIST)
    @JoinColumn(name="Addrs_fk")
    private Address address;
    
    public Long getId() {
        return id;
    }

    public List<LineItems> getOrderedItems() {
        return orderedItems;
    }

    public void setOrderedItems(List<LineItems> orderedItems) {
        this.orderedItems = orderedItems;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Double getAmount_due() {
        return amount_due;
    }

    public void setAmount_due(Double amount_due) {
        this.amount_due = amount_due;
    }

    public Date getCreation_time() {
        return creation_time;
    }

    public void setCreation_time(Date creation_time) {
        this.creation_time = creation_time;
    }

    
    public Customer_orders() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Customer_orders)) {
            return false;
        }
        Customer_orders other = (Customer_orders) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "za.ac.tut.ejb.entities.Customer_orders[ id=" + id + " ]";
    }
    
}
