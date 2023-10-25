package controller;

import org.springframework.hateoas.MediaTypes;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("v1/content")
public class ContentController {

    @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE, produces = MediaTypes.HAL_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public String postContentsWithFile(@RequestPart("metadata") String metaData,
                                             @RequestPart(value = "content", required = false) MultipartFile file,
                                             @RequestPart(value = "s3Location", required = false) String s3Location) {

        return "pamal";

    }

}
