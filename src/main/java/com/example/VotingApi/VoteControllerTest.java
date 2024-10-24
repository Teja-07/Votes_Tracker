package com.example.VotingApi;

import com.example.voteapi.service.VoteService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
@SpringBootTest
@AutoConfigureMockMvc
public class VoteControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private VoteService voteService;

    @Test
    public void testEnterCandidate() throws Exception {
        when(voteService.addCandidate("Ajay")).thenReturn("Candidate Ajay added successfully with vote count 0.");

        mockMvc.perform(get("/vote/entercandidate?name=Ajay"))
                .andExpect(status().isOk())
                .andExpect(content().string("Candidate Ajay added successfully with vote count 0."));
    }

    @Test
    public void testCastVote() throws Exception {
        when(voteService.castVote("Ajay")).thenReturn("Vote casted successfully. Ajay now has 1 votes.");

        mockMvc.perform(get("/vote/castvote?name=Ajay"))
                .andExpect(status().isOk())
                .andExpect(content().string("Vote casted successfully. Ajay now has 1 votes."));
    }

    @Test
    public void testCountVote() throws Exception {
        when(voteService.countVotes("Ajay")).thenReturn("Ajay has 1 votes.");

        mockMvc.perform(get("/vote/countvote?name=Ajay"))
                .andExpect(status().isOk())
                .andExpect(content().string("Ajay has 1 votes."));
    }

    @Test
    public void testGetWinner() throws Exception {
        when(voteService.getWinner()).thenReturn("Winner is Ajay with 1 votes.");

        mockMvc.perform(get("/vote/getwinner"))
                .andExpect(status().isOk())
                .andExpect(content().string("Winner is Ajay with 1 votes."));
    }
}
