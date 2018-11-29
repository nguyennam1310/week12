# week12
Tuần 12. Design pattern: Composite, Strategy
Câu 1. Hãy giúp Bob tìm mẫu thiết kế thích hợp với cấu trúc dữ liệu cho bài toán phả hệ như sau:
Từng cá nhân cần lưu các thông tin gồm: ngày tháng năm sinh, giới tính, v.v.
Một cá nhân có thể có một nhiều con hoặc không có con
Một cá nhân có thể kết hôn hoặc không
Ví dụ: James kết hôn với Hana sinh ra hai người con là Ryan và Kai. Ryan không lấy vợ. Kai lấy Jennifer sinh ra bốn người con gồm hai nam, hai nữ. Bốn người con này tiếp tục kết hôn và sinh con đẻ cái. 
Dựa trên mẫu thiết kế vừa tạo, hãy:
Tìm tất cả các cá nhân không kết hôn trong danh sách phả hệ
Tìm tất cả các cặp vợ chồng có hai con trong danh sách phả hệ
Tìm tất cả các thế hệ mới nhất trong danh sách phả hệ
Viết hàm main kiểm tra
Gợi ý: Sử dụng mẫu thiết kế Composite vì mẫu này thích hợp để lưu danh sách dạng cây
Câu 2. Cho một mảng các số nguyên có thể được sắp xếp tăng dần, hoặc giảm dần sử dụng thuật toán sắp xếp nổi bọt, hoặc sắp xếp chọn. Sau này, James mong muốn áp dụng thêm các thuật toán sắp xếp khác (hiện tại James chưa muốn cài đặt). Hãy giúp James xây dựng mẫu thiết kế thích hợp nhất. Viết hàm main để chạy thử chương trình.
Gợi ý: Sử dụng mẫu thiết kế Strategy
