package controller;

import model.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class Approve {

    @Value("${mail.from}")
    private String from;

    @Value("${mail.send}")
    private String send;

    @Autowired
    JavaMailSender mailSender;

    public void setApprove(RequestRepository repository, Request request) {
        Request request1 = repository.findByDateTime(request.getDateTime());
        if (request1 == null) {
            repository.save(request);
            sendEmail(request);
        }
    }

    private void sendEmail(Request request) {
        if (Boolean.parseBoolean(send)) {
            SimpleMailMessage message = new SimpleMailMessage();
            message.setFrom(from);
            message.setTo(request.getClient().getEmail());
            message.setText(String.format("Hello %s %s! \nYou request approve!\n" +
                            "Waiting for you on a %s on %s.", request.getClient().getName(),
                    request.getClient().getPatronymic(), request.getGoal(), request.getDateTime()));
            message.setSubject("CarShowroom");
            mailSender.send(message);
        }

    }
}
