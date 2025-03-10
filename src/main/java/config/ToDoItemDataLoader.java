package config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import controller.ToDoItemController;
import model.ToDoItem;
import repository.ToDoRepo;

@Component
public class ToDoItemDataLoader implements CommandLineRunner{
	
    private final Logger logger = LoggerFactory.getLogger(ToDoItemDataLoader.class);

    @Autowired
    ToDoRepo toDoRepo;

    @Override
    public void run(String... args) throws Exception {
        loadSeedData();
    }

    private void loadSeedData() {
        if (toDoRepo.count() == 0) {
            ToDoItem todoItem1 = new ToDoItem("Get the milk");
            ToDoItem todoItem2 = new ToDoItem("cut the leaves");

            toDoRepo.save(todoItem1);
            toDoRepo.save(todoItem2); 
        }

        logger.info("Number of TodoItems: {}", toDoRepo.count());
    }
}
