/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus.managment;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author User
 */
@Entity
@Table(name = "bus_details", catalog = "busm", schema = "")
@NamedQueries({
    @NamedQuery(name = "BusDetails.findAll", query = "SELECT b FROM BusDetails b")
    , @NamedQuery(name = "BusDetails.findById", query = "SELECT b FROM BusDetails b WHERE b.id = :id")
    , @NamedQuery(name = "BusDetails.findByBusNo", query = "SELECT b FROM BusDetails b WHERE b.busNo = :busNo")
    , @NamedQuery(name = "BusDetails.findByBusSource", query = "SELECT b FROM BusDetails b WHERE b.busSource = :busSource")
    , @NamedQuery(name = "BusDetails.findByBusDest", query = "SELECT b FROM BusDetails b WHERE b.busDest = :busDest")
    , @NamedQuery(name = "BusDetails.findBySzDate", query = "SELECT b FROM BusDetails b WHERE b.szDate = :szDate")
    , @NamedQuery(name = "BusDetails.findByPrice", query = "SELECT b FROM BusDetails b WHERE b.price = :price")
    , @NamedQuery(name = "BusDetails.findByDepartTime", query = "SELECT b FROM BusDetails b WHERE b.departTime = :departTime")
    , @NamedQuery(name = "BusDetails.findBySeat", query = "SELECT b FROM BusDetails b WHERE b.seat = :seat")})
public class BusDetails implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "bus_no")
    private String busNo;
    @Basic(optional = false)
    @Column(name = "bus_source")
    private String busSource;
    @Basic(optional = false)
    @Column(name = "bus_dest")
    private String busDest;
    @Basic(optional = false)
    @Column(name = "szDate")
    @Temporal(TemporalType.DATE)
    private Date szDate;
    @Basic(optional = false)
    @Column(name = "price")
    private String price;
    @Basic(optional = false)
    @Column(name = "departTime")
    private String departTime;
    @Basic(optional = false)
    @Column(name = "seat")
    private String seat;

    public BusDetails() {
    }

    public BusDetails(Integer id) {
        this.id = id;
    }

    public BusDetails(Integer id, String busNo, String busSource, String busDest, Date szDate, String price, String departTime, String seat) {
        this.id = id;
        this.busNo = busNo;
        this.busSource = busSource;
        this.busDest = busDest;
        this.szDate = szDate;
        this.price = price;
        this.departTime = departTime;
        this.seat = seat;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getBusNo() {
        return busNo;
    }

    public void setBusNo(String busNo) {
        String oldBusNo = this.busNo;
        this.busNo = busNo;
        changeSupport.firePropertyChange("busNo", oldBusNo, busNo);
    }

    public String getBusSource() {
        return busSource;
    }

    public void setBusSource(String busSource) {
        String oldBusSource = this.busSource;
        this.busSource = busSource;
        changeSupport.firePropertyChange("busSource", oldBusSource, busSource);
    }

    public String getBusDest() {
        return busDest;
    }

    public void setBusDest(String busDest) {
        String oldBusDest = this.busDest;
        this.busDest = busDest;
        changeSupport.firePropertyChange("busDest", oldBusDest, busDest);
    }

    public Date getSzDate() {
        return szDate;
    }

    public void setSzDate(Date szDate) {
        Date oldSzDate = this.szDate;
        this.szDate = szDate;
        changeSupport.firePropertyChange("szDate", oldSzDate, szDate);
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        String oldPrice = this.price;
        this.price = price;
        changeSupport.firePropertyChange("price", oldPrice, price);
    }

    public String getDepartTime() {
        return departTime;
    }

    public void setDepartTime(String departTime) {
        String oldDepartTime = this.departTime;
        this.departTime = departTime;
        changeSupport.firePropertyChange("departTime", oldDepartTime, departTime);
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        String oldSeat = this.seat;
        this.seat = seat;
        changeSupport.firePropertyChange("seat", oldSeat, seat);
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
        if (!(object instanceof BusDetails)) {
            return false;
        }
        BusDetails other = (BusDetails) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bus.managment.BusDetails[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
