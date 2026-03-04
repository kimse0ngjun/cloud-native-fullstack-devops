package cloud.notice.service;

import java.util.List;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import cloud.notice.dao.NoticeDAO; 
import cloud.notice.dto.NoticeDTO;
import cloud.notice.dto.pageDTO;

public class NoticeListService implements NoticeService {

    @Override
    public void execute(HttpServletRequest req, HttpServletResponse resp) {
        String pageParam = req.getParameter("page");
        int currentPage = (pageParam == null || Integer.parseInt(pageParam) < 1) ? 1 : Integer.parseInt(pageParam);

        NoticeDAO dao = new NoticeDAO();
        
        int totalRecords = dao.getTotalCount(); 
        int pageSize = 10; 
        int totalPages = (int) Math.ceil((double) totalRecords / pageSize);

        if (totalPages == 0) {
            totalPages = 1;
        }
        
        int startRow = (currentPage - 1) * pageSize; 
        List<NoticeDTO> list = dao.list(startRow, pageSize);

        pageDTO p = new pageDTO(currentPage, totalPages, 5);

        req.setAttribute("list", list);
        req.setAttribute("p", p); 
        req.setAttribute("currentPage", currentPage); 
        req.setAttribute("totalPages", totalPages);   
    }
}