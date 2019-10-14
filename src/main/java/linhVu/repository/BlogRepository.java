package linhVu.repository;

import linhVu.model.Blog;
import linhVu.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface BlogRepository extends PagingAndSortingRepository<Blog,Long> {
    Iterable<Blog>findAllByCategory(Category category);
    Page<Blog> findAllByTitleContaining(String title, Pageable pageable);

}
