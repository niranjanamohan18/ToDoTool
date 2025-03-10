package model;

import java.time.Instant;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "todo_item")
@Data
public class ToDoItem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String description;
	private boolean complete;
	private Instant createdDate;
	private Instant modifiedDate;
	public ToDoItem(String description) {
		super();
		this.id = id;
		this.description = description;
		this.complete = complete;
		this.createdDate = createdDate;
		this.modifiedDate = modifiedDate;
	}
	@Override
	public String toString() {
		return "ToDoItem [id=" + id + ", description=" + description + ", complete=" + complete + ", createdDate="
				+ createdDate + ", modifiedDate=" + modifiedDate + "]";
	}
	
	
}

