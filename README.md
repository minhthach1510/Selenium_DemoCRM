# Dự án thực hành kiểm thử tự động website CRM Demo (Selenium & Java)

Đây là dự án kiểm thử tự động nhỏ, sử dụng Selenium WebDriver với Java và TestNG để kiểm tra các chức năng cơ bản của một trang web CRM demo: [https://crm.anhtester.com/admin/authentication](https://crm.anhtester.com/admin/authentication).

Dự án này được tạo ra với mục đích thực hành và minh họa kỹ năng kiểm thử tự động.

## Công nghệ sử dụng

* **Ngôn ngữ**: Java (17)
* **Kiểm thử**: Selenium WebDriver, TestNG
* **Build & Quản lý thư viện**: Maven
* **WebDriver**: WebDriverManager
* **Mô hình**: Page Object Model (POM)

## Các chức năng chính được kiểm thử

* Đăng nhập (thành công, thất bại, sai định dạng email).
* Thêm mới Khách hàng.
* Xem chi tiết thông tin Khách hàng và xác minh nội dung hiển thị.

## Điều kiện cần có

* JDK 17+
* Apache Maven
* Một IDE Java (ví dụ: IntelliJ IDEA, Eclipse)

## Cách chạy kiểm thử

1.  **Clone dự án:**
    ```bash
    git clone https://github.com/minhthach1510/AutomationTests_DemoCRM
    cd Demo_CRM
    ```

2.  **Mở dự án bằng IDE:**
    * Mở dự án với IDE của bạn. IDE sẽ tự động tải các thư viện cần thiết từ `pom.xml`.

3.  **Chạy kiểm thử trong IDE:**
    * **Chạy toàn bộ qua `testNG.xml`**: Chuột phải vào file `testNG.xml` và chọn "Run '...\testNG.xml'".
    * **Chạy từng lớp Test (Test Class)**: Mở một lớp kiểm thử (ví dụ: `SigningTest.java`), chuột phải vào tên lớp và chọn "Run 'SigningTest'".
   

    *Lưu ý: WebDriverManager sẽ tự động quản lý driver cho trình duyệt (mặc định là Chrome).*
