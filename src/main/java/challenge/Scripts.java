package challenge;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "scripts")
public final class Scripts implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
   /* @Column(name = "episode")
    private Integer episode;
    @Column(name = "episode_name")
    private String episodeName;
    @Column(name = "segment")
    private String segment;
    @Column(name = "type")
    private String type;*/
    @Column(name = "actor")
    private String actor;
   /* @Column(name = "character")
    private String character;*/
    @Column(name = "detail")
    private String detail;
   /* @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(name = "record_date")
    private Timestamp recordDate;
    @Column(name = "series")
    private String series;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(name = "transmission_date")
    private Timestamp transmissionDate;*/


    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getId() {
        return id;
    }

   /* public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEpisode() {
        return episode;
    }

    public void setEpisode(Integer episode) {
        this.episode = episode;
    }*/

   /* public String getEpisodeName() {
        return episodeName;
    }

    public void setEpisodeName(String episodeName) {
        this.episodeName = episodeName;
    }

    public String getSegment() {
        return segment;
    }

    public void setSegment(String segment) {
        this.segment = segment;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }*/

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

   /* public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }
*/
    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    /*public Timestamp getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(Timestamp recordDate) {
        this.recordDate = recordDate;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public Timestamp getTransmissionDate() {
        return transmissionDate;
    }

    public void setTransmissionDate(Timestamp transmissionDate) {
        this.transmissionDate = transmissionDate;
    }
*/

}