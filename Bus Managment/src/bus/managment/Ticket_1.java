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
import javax.persistence.Lob;
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
@Table(name = "ticket", catalog = "busm", schema = "")
@NamedQueries({
    @NamedQuery(name = "Ticket_1.findAll", query = "SELECT t FROM Ticket_1 t")
    , @NamedQuery(name = "Ticket_1.findById", query = "SELECT t FROM Ticket_1 t WHERE t.id = :id")
    , @NamedQuery(name = "Ticket_1.findByBusSource", query = "SELECT t FROM Ticket_1 t WHERE t.busSource = :busSource")
    , @NamedQuery(name = "Ticket_1.findByBusDest", query = "SELECT t FROM Ticket_1 t WHERE t.busDest = :busDest")
    , @NamedQuery(name = "Ticket_1.findByCombo", query = "SELECT t FROM Ticket_1 t WHERE t.combo = :combo")
    , @NamedQuery(name = "Ticket_1.findByDate", query = "SELECT t FROM Ticket_1 t WHERE t.date = :date")
    , @NamedQuery(name = "Ticket_1.findByMesta", query = "SELECT t FROM Ticket_1 t WHERE t.mesta = :mesta")})
public class Ticket_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "bus_source")
    private String busSource;
    @Basic(optional = false)
    @Column(name = "bus_dest")
    private String busDest;
    @Basic(optional = false)
    @Column(name = "combo")
    private String combo;
    @Basic(optional = false)
    @Column(name = "date")
    @Temporal(TemporalType.DATE)
    private Date date;
    @Basic(optional = false)
    @Column(name = "Mesta")
    private String mesta;
    @Basic(optional = false)
    @Lob
    @Column(name = "b")
    private String b;

    public Ticket_1() {
    }

    public Ticket_1(Integer id) {
        this.id = id;
    }

    public Ticket_1(Integer id, String busSource, String busDest, String combo, Date date, String mesta, String b) {
        this.id = id;
        this.busSource = busSource;
        this.busDest = busDest;
        this.combo = combo;
        this.date = date;
        this.mesta = mesta;
        this.b = b;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
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

    public String getCombo() {
        return combo;
    }

    public void setCombo(String combo) {
        String oldCombo = this.combo;
        this.combo = combo;
        changeSupport.firePropertyChange("combo", oldCombo, combo);
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        Date oldDate = this.date;
        this.date = date;
        changeSupport.firePropertyChange("date", oldDate, date);
    }

    public String getMesta() {
        return mesta;
    }

    public void setMesta(String mesta) {
        String oldMesta = this.mesta;
        this.mesta = mesta;
        changeSupport.firePropertyChange("mesta", oldMesta, mesta);
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        String oldB = this.b;
        this.b = b;
        changeSupport.firePropertyChange("b", oldB, b);
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
        if (!(object instanceof Ticket_1)) {
            return false;
        }
        Ticket_1 other = (Ticket_1) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bus.managment.Ticket_1[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
