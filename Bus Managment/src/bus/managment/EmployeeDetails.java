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
@Table(name = "employee_details", catalog = "busm", schema = "")
@NamedQueries({
    @NamedQuery(name = "EmployeeDetails.findAll", query = "SELECT e FROM EmployeeDetails e")
    , @NamedQuery(name = "EmployeeDetails.findById", query = "SELECT e FROM EmployeeDetails e WHERE e.id = :id")
    , @NamedQuery(name = "EmployeeDetails.findByFirstname", query = "SELECT e FROM EmployeeDetails e WHERE e.firstname = :firstname")
    , @NamedQuery(name = "EmployeeDetails.findByLastname", query = "SELECT e FROM EmployeeDetails e WHERE e.lastname = :lastname")
    , @NamedQuery(name = "EmployeeDetails.findByPhoneno1", query = "SELECT e FROM EmployeeDetails e WHERE e.phoneno1 = :phoneno1")})
public class EmployeeDetails implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "firstname")
    private String firstname;
    @Basic(optional = false)
    @Column(name = "lastname")
    private String lastname;
    @Basic(optional = false)
    @Column(name = "phoneno1")
    private String phoneno1;

    public EmployeeDetails() {
    }

    public EmployeeDetails(Integer id) {
        this.id = id;
    }

    public EmployeeDetails(Integer id, String firstname, String lastname, String phoneno1) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.phoneno1 = phoneno1;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        String oldFirstname = this.firstname;
        this.firstname = firstname;
        changeSupport.firePropertyChange("firstname", oldFirstname, firstname);
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        String oldLastname = this.lastname;
        this.lastname = lastname;
        changeSupport.firePropertyChange("lastname", oldLastname, lastname);
    }

    public String getPhoneno1() {
        return phoneno1;
    }

    public void setPhoneno1(String phoneno1) {
        String oldPhoneno1 = this.phoneno1;
        this.phoneno1 = phoneno1;
        changeSupport.firePropertyChange("phoneno1", oldPhoneno1, phoneno1);
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
        if (!(object instanceof EmployeeDetails)) {
            return false;
        }
        EmployeeDetails other = (EmployeeDetails) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bus.managment.EmployeeDetails[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
