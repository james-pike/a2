package cst8218.pike0040.appuser;

import java.io.Serializable;
import java.util.HashMap;
import javax.enterprise.inject.Instance;
import javax.enterprise.inject.spi.CDI;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.security.enterprise.identitystore.PasswordHash;
import javax.security.enterprise.identitystore.Pbkdf2PasswordHash;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author James Pike, Alejandro Suarez
 */
@Entity
//@Table(name="APPUSER")
@XmlRootElement
//@NamedQueries({
//    @NamedQuery(name = "APPUSER.findAll", query = "SELECT c FROM AppUser c"),
//    @NamedQuery(name = "APPUSER.findById", query = "SELECT c FROM AppUser c WHERE c.id = :id"),
//    @NamedQuery(name = "APPUSER.findByUserid", query = "SELECT c FROM AppUser c WHERE c.userid = :userid"),
//    @NamedQuery(name = "APPUSER.findByGroupname", query = "SELECT c FROM AppUser c WHERE c.groupname = :groupname")})
public class AppUser implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @Column(name = "USERID")
    @Size(max = 255)
    private String userid;
    
    @NotNull
    @Column(name = "PASSWORD")
    @Size(max = 2048)
    private String password;
    
    @NotNull
    @Column(name = "GROUPNAME")
    @Size(max = 255)
    private String groupname;
    
    
    public AppUser() {
    }

    public AppUser(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getPassword() {
//        return password;
        return "";
    }

    public void setPassword(String password) {
//        this.password = password;

        if(password.isEmpty()) return ;
        
        //set password entry
        //initialize a PasswordHash object which will generate password hashes
        Instance<?extends PasswordHash> instance = CDI.current().select(Pbkdf2PasswordHash.class);
        PasswordHash passwordHash = instance.get();
        passwordHash.initialize(new HashMap<String,String>()); // todo: are the defaults good enough?
        // now we can generate a password entry for a given password
        String passwordEntry = password; //the user has chosen a password
        passwordEntry = passwordHash.generate(passwordEntry.toCharArray()); 
        //at this point, passwordEntry refers to a salted/hashed password entry corresponding to the chosen password
        this.password = passwordEntry;
    }

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname;
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
        if (!(object instanceof AppUser)) {
            return false;
        }
        AppUser other = (AppUser) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.mavenproject4.Contact[ id=" + id + " ]";
    }
    
}