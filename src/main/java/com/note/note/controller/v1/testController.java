package com.note.note.controller.v1;

import com.note.note.entity.Block;
import com.note.note.entity.BlockTypes;
import com.note.note.entity.Content;
import com.note.note.repository.BlockRepository;
import com.note.note.repository.ContentRepository;
import lombok.AllArgsConstructor;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1")
public class testController {

    private final BlockRepository blockRepository;
    private final ContentRepository contentRepository;

    @PostMapping(path = "/note")
    public void addBlock(@RequestBody String userinput) throws ParseException {
        JSONParser jsonParser = new JSONParser();
        JSONObject jsonObject = (JSONObject) jsonParser.parse(userinput);
        JSONArray jsonContentArray = (JSONArray) jsonObject.get("Contents");
        Block newBlock = Block.builder()
                .Alive((boolean) jsonObject.get("Alive"))
                .Title((String) jsonObject.get("Title"))
                .CreatedBy((String) jsonObject.get("CreatedBy"))
                .LastEditedBy((String) jsonObject.get("LastEditedBy"))
                .Type(BlockTypes.TEXT)
                .build();
        List<Content> ContentsList = new ArrayList<>();
        for(Object c : jsonContentArray){
            JSONObject a = (JSONObject) c;
            Content newContent = new Content((String)a.get("Content"));
            ContentsList.add(newContent);
            contentRepository.save(newContent);
        }
//        newBlock.setContents(ContentsList);
        blockRepository.save(newBlock);

    }

}
