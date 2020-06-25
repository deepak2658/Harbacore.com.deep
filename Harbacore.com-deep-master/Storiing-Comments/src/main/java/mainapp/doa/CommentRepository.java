package mainapp.doa;

import mainapp.Model.StoreComment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<StoreComment,Integer> {
}
