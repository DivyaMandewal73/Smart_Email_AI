 // Email Structure //

package com.email.divya.ai_email_assistant.app;

 import lombok.Data;
 import lombok.Getter;

 @Data                                //generate getters,setters,tostring,equals(),hashCode(),RequiredArgsConstructor
public class EmailRequest {
    @Getter
    private String emailContent;    //Content of email
    private String tone;           //tone of the reply - casual,sarcastic,formal etc
     private String purpose;

     public void setEmailContent(String emailContent) {
         this.emailContent = emailContent;
     }
 }
