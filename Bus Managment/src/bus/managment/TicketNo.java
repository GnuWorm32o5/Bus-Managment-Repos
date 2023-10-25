/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus.managment;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author User
 */
@Entity
@Table(name = "ticket_no", catalog = "busm", schema = "")
@NamedQueries({
    @NamedQuery(name = "TicketNo.findAll", query = "SELECT t FROM TicketNo t")
    , @NamedQuery(name = "TicketNo.findById", query = "SELECT t FROM TicketNo t WHERE t.id = :id")
    , @NamedQuery(name = "TicketNo.findByTicketNo", query = "SELECT t FROM TicketNo t WHERE t.ticketNo = :ticketNo")
    , @NamedQuery(name = "TicketNo.findByPrice", query = "SELECT t FROM TicketNo t WHERE t.price = :price")})
public class TicketNo implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "ticket_no")
    private String ticketNo;
    @Basic(optional = false)
    @Column(name = "price")
    private String price;

    public TicketNo() {
    }

    public TicketNo(Integer id) {
        this.id = id;
    }

    public TicketNo(Integer id, String ticketNo, String price) {
        this.id = id;
        this.ticketNo = ticketNo;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getTicketNo() {
        return ticketNo;
    }

    public void setTicketNo(String ticketNo) {
        String oldTicketNo = this.ticketNo;
        this.ticketNo = ticketNo;
        changeSupport.firePropertyChange("ticketNo", oldTicketNo, ticketNo);
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        String oldPrice = this.price;
        this.price = price;
        changeSupport.firePropertyChange("price", oldPrice, price);
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
        if (!(object instanceof TicketNo)) {
            return false;
        }
        TicketNo other = (TicketNo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bus.managment.TicketNo[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
