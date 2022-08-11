package cst8218.pike0040.entity;

import cst8218.pike0040.xml.ColorAdapter;
import cst8218.pike0040.json.JsonColorDeserializer;
import cst8218.pike0040.json.JsonColorSerializer;
import java.awt.Color;
import java.awt.Graphics;
import java.io.Serializable;
import java.util.Random;
import javax.json.bind.annotation.JsonbTypeDeserializer;
import javax.json.bind.annotation.JsonbTypeSerializer;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * This is an entity class of a sprite data.
 * @author James Pike
 */
@Entity
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Sprite implements Serializable {

    private static final long serialVersionUID = 1L;

    public final static Random random = new Random();

    final static int SIZE = 10;
    final static int MAX_SPEED = 5;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    @Column
    @Min(0)
    private Integer panelWidth; 
    @Column
    @Min(0)
    private Integer panelHeight;
    
    @Column
    @Min(0)
    private Integer x;
    @Column
    @Min(0)
    private Integer y;
    
    @Column
    private Integer dx;
    @Column
    private Integer dy;
    
    @XmlElement
    @XmlJavaTypeAdapter(ColorAdapter.class)
    @JsonbTypeSerializer(JsonColorSerializer.class)
    @JsonbTypeDeserializer(JsonColorDeserializer.class) 
    @Column
    private Color color = Color.BLUE;


    public Sprite() {
    }

    public Sprite(Integer height, Integer width) {
        this.panelWidth = width;
        this.panelHeight = height;
        x = random.nextInt(width);
        y = random.nextInt(height);
        dx = random.nextInt(2 * MAX_SPEED) - MAX_SPEED;
        dy = random.nextInt(2 * MAX_SPEED) - MAX_SPEED;
    }

    public Sprite(Integer height, Integer width, Color color) {
        this(height, width);
        this.color = color;
    }

    public Integer getPanelWidth() {
        return panelWidth;
    }

    public void setPanelWidth(Integer panelWidth) {
        this.panelWidth = panelWidth;
    }

    public Integer getPanelHeight() {
        return panelHeight;
    }

    public void setPanelHeight(Integer panelHeight) {
        this.panelHeight = panelHeight;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public Integer getDx() {
        return dx;
    }

    public void setDx(Integer dx) {
        this.dx = dx;
    }

    public Integer getDy() {
        return dy;
    }

    public void setDy(Integer dy) {
        this.dy = dy;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, SIZE, SIZE);
    }

    public void move() {

        // check for bounce and make the ball bounce if necessary
        //
        if (x < 0 && dx < 0) {
            //bounce off the left wall 
            x = 0;
            dx = -dx;
        }
        if (y < 0 && dy < 0) {
            //bounce off the top wall
            y = 0;
            dy = -dy;
        }
        if (x > panelWidth - SIZE && dx > 0) {
            //bounce off the right wall
            x = panelWidth - SIZE;
            dx = -dx;
        }
        if (y > panelHeight - SIZE && dy > 0) {
            //bounce off the bottom wall
            y = panelHeight - SIZE;
            dy = -dy;
        }

        //make the ball move
        x += dx;
        y += dy;
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
        if (!(object instanceof Sprite)) {
            return false;
        }
        Sprite other = (Sprite) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Sprite[ id=" + id + " ]";
    }

    
    /**
     * Update existing sprite in RESTful web services unless all values are not null.
     * @param old an existing sprite
     * @return an updated sprite
     */
    public Sprite updates(Sprite old){
        if(this.panelWidth != null) {
            if(this.panelWidth>=0)
                old.panelWidth = this.panelWidth;
        }

        if(this.panelHeight != null) {
            if(this.panelHeight>=0)
                old.panelHeight = this.panelHeight;
        }

        if(this.x != null && this.x>=0) {
            if(this.x>=0)
               old.x = this.x;
        }
        if(this.y != null) {
            if(this.y>=0)
                old.y = this.y;
        }

        if(this.dx != null) old.dx = this.dx;
        if(this.dy != null) old.dy = this.dy;

        if(this.color != null) old.color = this.color;

        return old;
    }
    
    
    /**
     * Check for null to auto generate sprite in RESTful web services.
     * If there are null values in a sprite, change with default values.
     */
    public void checkNull() {
        if(panelHeight == null) panelHeight = 500;
        if(panelWidth == null) panelWidth = 500;
        if(x == null) x = 0;
        if(y == null) y = 0;
        if(dx == null) dx = 0;
        if(dy == null) dy = 0;
        if(color == null) color = Color.BLUE;
    }
}
