/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package game.env.ai;

import game.env.quest.Quest;

/**
 *
 * @author FBA
 */
public interface QuestGiver {
    
    public boolean hasNewQuest();
    
    public boolean hasOpenQuest();
    
    public Quest receiveQuest();
    
    public void returnQuest();
    
}
