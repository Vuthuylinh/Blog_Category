package linhVu.service.impl;

import linhVu.model.Blog;
import linhVu.model.Category;
import linhVu.repository.BlogRepository;
import linhVu.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.ArrayList;
import java.util.List;

public class BlogServiceImpl implements BlogService {
    @Autowired
    BlogRepository blogRepository;
    @Override
    public Page<Blog> findAll(Pageable pageable) {
        return blogRepository.findAll(pageable);
    }

    @Override
    public Blog findById(Long id) {
        return blogRepository.findOne(id);
    }

    @Override
    public void save(Blog blog) {
        blogRepository.save(blog);

    }

    @Override
    public void remove(Long id) {
    blogRepository.delete(id);
    }

    @Override
    public Iterable<Blog> findAllByCategory(Category category) {
        return blogRepository.findAllByCategory(category);
    }

    @Override
    public Page<Blog> findAllByTitleContaining(String title, Pageable pageable) {
        return blogRepository.findAllByTitleContaining(title,pageable);
    }

    @Override
    public List<Integer> getNumberPage(Page<Blog> blogs) {
        int blogPage = blogs.getTotalPages();
        List<Integer> blogPages = new ArrayList<>();
        for (int i = 0; i < blogPage; i++) {
            blogPages.add(i);
        }
        return blogPages;
    }
}
