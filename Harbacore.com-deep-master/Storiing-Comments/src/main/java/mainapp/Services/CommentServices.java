package mainapp.Services;

import mainapp.Model.StoreComment;
import mainapp.doa.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentServices {
    @Autowired
    private CommentRepository repository;



    public void addComment(StoreComment comment) {
        repository.save(comment);
    }
}
