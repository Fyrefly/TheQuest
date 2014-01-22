/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package game.env.quest;

import game.env.ai.QuestGiver;
import java.util.List;

/**
 *
 * @author FBA
 */
public class Quest {
    
    private List<Task> tasks;
    
    private QuestGiver questGiver;
    
    public Quest(final QuestGiver questGiver) {
        this.questGiver = questGiver;
    }
    
    /**
     * Adds a new task to the quest's task list.
     * @param newTask 
     */
    protected void addTask(final Task newTask) {
        if(!tasks.contains(newTask)) {
            tasks.add(newTask);
        }
    }
    
    protected boolean removeTask(final Task task) {
        return tasks.remove(task);
    }
    
}
