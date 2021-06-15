package javaCamp.HRMSProject.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobAdvertisements"})
@Table(name="working_times")
@NoArgsConstructor
@AllArgsConstructor

public class WorkingTime {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="working_time_id")
	private int workingTimeId;
	
	@Column(name="working_time")
	private String workingTime;
	
	@OneToMany(mappedBy = "workingTime")
	private List<JobAdvertisement> jobAdvertisements;
}