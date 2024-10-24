package com.example.VotingApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/vote")
public class VoteController {
    @Autowired
    private final VoteService voteService;

    public VoteController(VoteService voteService) {
        this.voteService = voteService;
    }

    @PostMapping("/entercandidate")
    public String enterCandidate(@RequestParam String name) {
        return voteService.addCandidate(name);
    }
    @GetMapping("/castvote")
    public String castVote(@RequestParam String name) {
        return voteService.castVote(name);
    }
    @GetMapping("/countvote")
    public String countVote(@RequestParam String name) {
        return voteService.currentVotedCount(name);
    }
    @GetMapping("/listvote")
    public Map<String, Integer> listVotes() {
        return voteService.allVotesList();
    }
    @GetMapping("/getwinner")
    public String getWinner() {
        return voteService.getWinner();
    }


}
