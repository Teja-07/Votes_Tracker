package com.example.VotingApi;

import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class VoteService {
    //as we are not using any database so it will help use to store the data in concrrent fashion
    // here it is using key value format to store the data
    private final Map<String, Integer> countcandidates = new ConcurrentHashMap<>();
    public String addCandidate(String name){
        if(!countcandidates.containsKey(name)){
            countcandidates.put(name,0);
        }
        return "Candidate " + name + " added successfully with vote count 0";
    }
    public  String castVote(String name){
        if(!countcandidates.containsKey(name)){
            return name+"candidates you selected does not exist in the system";
        }
        countcandidates.put(name,countcandidates.getOrDefault(name,0)+1);
        return "Vote casted successfully. " + name + " now has " + (countcandidates.get(name)) + " votes.";
    }
    public  String currentVotedCount(String name){
        if(!countcandidates.containsKey(name)){
            return name+"The existing candidates doest not exist";
        }
        return name + " has " + countcandidates.get(name) + " votes.";
    }
    public Map<String,Integer> allVotesList(){
        return countcandidates;
    }
    public  String getWinner(){
        Optional<Map.Entry<String,Integer>> winnerCount=countcandidates.entrySet().stream().max(Map.Entry.comparingByValue());
        return winnerCount.map(entry -> "Winner is " + entry.getKey() + " with " + entry.getValue() + " votes.").orElse("No candidates available.");
    }
}
