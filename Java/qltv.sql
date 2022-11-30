-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 18, 2021 at 03:06 PM
-- Server version: 10.4.21-MariaDB
-- PHP Version: 8.0.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `qltv`
--

-- --------------------------------------------------------

--
-- Table structure for table `authors`
--

CREATE TABLE `authors` (
  `id_author` varchar(10) NOT NULL,
  `author_name` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `authors`
--

INSERT INTO `authors` (`id_author`, `author_name`) VALUES
('TG01', 'Xuân Quỳnh'),
('TG02', 'Hồ Chí Minh'),
('TG03', 'Nguyễn Nhật Ánh'),
('TG04', 'Tô Hoài'),
('TG05', 'Rosie Nguyễn'),
('TG06', 'Nam Cao'),
('TG07', 'Cao Tiến'),
('TG08', 'Alexander Puskin'),
('TG09', 'Truyện dân gian'),
('TG10', 'Cambridge'),
('TG11', 'Dân gian');

-- --------------------------------------------------------

--
-- Table structure for table `books`
--

CREATE TABLE `books` (
  `id_book` varchar(10) NOT NULL,
  `title` varchar(100) NOT NULL,
  `quantity` int(11) NOT NULL,
  `price` int(11) NOT NULL,
  `release_year` int(11) DEFAULT NULL,
  `total_page` int(11) DEFAULT NULL,
  `id_author` varchar(10) DEFAULT NULL,
  `id_publisher` varchar(10) DEFAULT NULL,
  `id_category` varchar(10) DEFAULT NULL,
  `id_language` varchar(10) DEFAULT NULL,
  `last_update` datetime DEFAULT current_timestamp(),
  `reality_quantity` int(11) NOT NULL,
  `location` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `books`
--

INSERT INTO `books` (`id_book`, `title`, `quantity`, `price`, `release_year`, `total_page`, `id_author`, `id_publisher`, `id_category`, `id_language`, `last_update`, `reality_quantity`, `location`) VALUES
('MS003', 'Tấm Cám', 10, 50000, 2020, 100, 'TG09', 'NXB03', 'DM01', 'NN02', '2021-12-13 09:23:50', 98, '0'),
('MS004', 'Mai An Tiêm', 13, 12000, 2020, 100, 'TG11', 'NXB01', 'DM01', 'NN01', '2021-12-13 10:23:12', 301, '0'),
('MS01', 'Ông lão đánh cá và con cá vàng', 16, 100000, 2020, 100, 'TG08', 'NXB01', 'DM01', 'NN01', '2021-12-12 16:29:12', 15, '0'),
('MS02', 'Du lịch', 28, 35000, 2001, 100, 'TG07', 'NXB01', 'DM03', 'NN02', '2021-12-12 23:38:48', 27, '0'),
('S0001', 'Tôi thấy hoa vàng trên cỏ xanh', 3, 100, 2018, 100, 'TG03', 'NXB03', 'DM01', 'NN01', '2021-12-13 07:10:09', 3, '0');

-- --------------------------------------------------------

--
-- Table structure for table `categories`
--

CREATE TABLE `categories` (
  `id_category` varchar(10) NOT NULL,
  `name` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `categories`
--

INSERT INTO `categories` (`id_category`, `name`) VALUES
('DM01', 'Truyện'),
('DM02', 'Báo'),
('DM03', 'Sách'),
('DM04', 'Tự truyện'),
('DM05', 'Luận văn tiến sĩ'),
('DM06', 'Nghiên cứu khoa học');

-- --------------------------------------------------------

--
-- Table structure for table `idv_detail`
--

CREATE TABLE `idv_detail` (
  `id_idv_detail` varchar(10) NOT NULL,
  `quantity` int(11) DEFAULT NULL,
  `id_idv` varchar(10) DEFAULT NULL,
  `id_book` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `idv_detail`
--

INSERT INTO `idv_detail` (`id_idv_detail`, `quantity`, `id_idv`, `id_book`) VALUES
('CT01', 12, 'HD01', 'MS01'),
('CT02', 23, 'HD02', 'MS02'),
('CT03', 3, 'HD03', 'S0001'),
('CT04', 100, 'HD04', 'MS01'),
('CT05', 100, 'HD05', 'MS003'),
('CT06', 300, 'HD06', 'MS004'),
('CT07', 100, 'HD07', 'MS004');

-- --------------------------------------------------------

--
-- Table structure for table `inv_deli_voucher`
--

CREATE TABLE `inv_deli_voucher` (
  `id_idv` varchar(10) NOT NULL,
  `id_staff` varchar(10) DEFAULT NULL,
  `date` datetime DEFAULT current_timestamp(),
  `id_supplier` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `inv_deli_voucher`
--

INSERT INTO `inv_deli_voucher` (`id_idv`, `id_staff`, `date`, `id_supplier`) VALUES
('HD01', 'NV01', '2021-12-12 23:39:52', 'NCC01'),
('HD02', 'NV04', '2021-12-12 23:41:05', 'NCC01'),
('HD03', 'NV01', '2021-12-13 07:10:10', 'NCC01'),
('HD04', 'NV01', '2021-12-13 09:22:00', 'NCC01'),
('HD05', 'NV01', '2021-12-13 09:23:51', 'NCC01'),
('HD06', 'NV02', '2021-12-13 10:23:13', 'NCC01'),
('HD07', 'NV01', '2021-12-13 10:53:47', 'NCC02');

-- --------------------------------------------------------

--
-- Table structure for table `languages`
--

CREATE TABLE `languages` (
  `id_language` varchar(10) NOT NULL,
  `name` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `languages`
--

INSERT INTO `languages` (`id_language`, `name`) VALUES
('NN01', 'Tiếng Việt'),
('NN02', 'Tiếng Anh'),
('NN03', 'Tiếng Nga'),
('NN04', 'Tiếng Pháp'),
('NN05', 'Tiếng Hàn'),
('NN06', 'Tiếng Nhật');

-- --------------------------------------------------------

--
-- Table structure for table `member_card`
--

CREATE TABLE `member_card` (
  `id_lib_card` varchar(10) NOT NULL,
  `created_at` datetime DEFAULT current_timestamp(),
  `id_staff` varchar(10) NOT NULL,
  `id_reader` varchar(10) NOT NULL,
  `expiration_date` datetime NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `member_card`
--

INSERT INTO `member_card` (`id_lib_card`, `created_at`, `id_staff`, `id_reader`, `expiration_date`) VALUES
('TTV001', '2021-12-12 12:04:07', 'NV01', 'DG001', '2022-12-12 00:00:00'),
('TTV002', '2021-12-12 12:04:07', 'NV01', 'DG002', '2021-12-12 12:04:07'),
('TTV003', '2021-12-13 10:25:36', 'NV02', 'DG003', '2022-12-13 00:00:00'),
('TTV004', '2021-12-13 10:58:10', 'NV02', 'DG004', '2022-12-13 00:00:00');

-- --------------------------------------------------------

--
-- Table structure for table `publishers`
--

CREATE TABLE `publishers` (
  `id_publisher` varchar(10) NOT NULL,
  `name` varchar(100) NOT NULL,
  `address` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `publishers`
--

INSERT INTO `publishers` (`id_publisher`, `name`, `address`) VALUES
('NXB01', 'NXB Kim Đồng', 'Hà Nội'),
('NXB02', 'NXB Hồng Đức', 'Hà Nội'),
('NXB03', 'NXB Thanh Niên', 'Tp.HCM'),
('NXB04', 'NXB Lao Động', 'Tp.HCM'),
('NXB05', 'NXB Đại học sư phạm', 'Hà Nội'),
('NXB06', 'NXB Phương Đông', 'Tp.HCM'),
('NXB07', 'NXB Chính trị quốc gia', 'Tp.HCM'),
('NXB08', 'NXB Phụ nữ', 'Tp.Đà Nẵng'),
('NXB09', 'NXB Lao động xã hội', 'Tp.HCM');

-- --------------------------------------------------------

--
-- Table structure for table `readers`
--

CREATE TABLE `readers` (
  `id_reader` varchar(10) NOT NULL,
  `firstname` varchar(50) NOT NULL,
  `lastname` varchar(50) NOT NULL,
  `birthday` date DEFAULT NULL,
  `gender` varchar(6) DEFAULT NULL,
  `pid` varchar(12) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `reader_type` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `readers`
--

INSERT INTO `readers` (`id_reader`, `firstname`, `lastname`, `birthday`, `gender`, `pid`, `address`, `reader_type`) VALUES
('DG001', 'Thư', 'Huỳnh Thị Ngọc', '2001-04-17', 'Nữ', '123456789', '53 Võ Văn Ngân, Linh Chieu, Thu Duc', 1),
('DG002', 'Thúy', 'Nguyễn Ngọc ', '2002-10-01', 'Nữ', '1234567', '94 đường số 7, Quận 9', 2),
('DG003', 'My', 'Phạm', '2021-12-13', 'Nu', '123456756', 'Quận 9', 1),
('DG004', 'My', 'Phạm', '1999-12-15', 'Nu', '123456778', 'Thủ Đức', 1);

-- --------------------------------------------------------

--
-- Table structure for table `reader_type`
--

CREATE TABLE `reader_type` (
  `type_id` int(11) NOT NULL,
  `name` varchar(100) NOT NULL,
  `quantity` int(11) NOT NULL,
  `lib_fee` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `reader_type`
--

INSERT INTO `reader_type` (`type_id`, `name`, `quantity`, `lib_fee`) VALUES
(1, 'Công dân', 3, 50000),
(2, 'Công chức nhà nước', 5, 50000),
(3, 'Hội nhà văn', 5, 500000),
(4, 'Người cao tuổi/ Khuyến tật', 3, 0);

-- --------------------------------------------------------

--
-- Table structure for table `reason`
--

CREATE TABLE `reason` (
  `id_reason` int(11) NOT NULL,
  `name` varchar(100) NOT NULL,
  `amount` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `reason`
--

INSERT INTO `reason` (`id_reason`, `name`, `amount`) VALUES
(2, 'Đăng ký thẻ', 20000),
(3, 'Gia hạn thẻ', 20000),
(4, 'Trả sách muộn', 2000),
(5, 'Đăng ký dịch vụ mượn về', 200000);

-- --------------------------------------------------------

--
-- Table structure for table `receipt`
--

CREATE TABLE `receipt` (
  `id_receipt` varchar(10) NOT NULL,
  `id_reader` varchar(10) NOT NULL,
  `id_staff` varchar(10) NOT NULL,
  `reason` int(11) NOT NULL,
  `total_day` int(11) NOT NULL,
  `amount` int(11) NOT NULL,
  `created_at` datetime NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `rental_detail`
--

CREATE TABLE `rental_detail` (
  `id_rental_detail` int(11) NOT NULL,
  `borrowed_date` datetime NOT NULL DEFAULT current_timestamp(),
  `return_date` datetime DEFAULT NULL,
  `id_book` varchar(10) DEFAULT NULL,
  `id_lib_card` varchar(10) DEFAULT NULL,
  `id_staff` varchar(10) DEFAULT NULL,
  `status` text DEFAULT NULL,
  `status_borow` varchar(25) DEFAULT 'Đang mượn'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `rental_detail`
--

INSERT INTO `rental_detail` (`id_rental_detail`, `borrowed_date`, `return_date`, `id_book`, `id_lib_card`, `id_staff`, `status`, `status_borow`) VALUES
(6, '2021-12-13 00:00:00', '2021-12-16 00:00:00', 'MS003', 'TTV001', 'NV01', '', 'Đã trả'),
(7, '2021-12-13 00:00:00', '2021-12-16 00:00:00', 'MS003', 'TTV001', 'NV01', '', 'Đang mượn'),
(8, '2021-12-13 00:00:00', '2021-12-16 00:00:00', 'MS004', 'TTV001', 'NV01', '', 'Đang mượn'),
(9, '2021-12-13 00:00:00', '2021-12-16 00:00:00', 'MS003', 'TTV004', 'NV01', '', 'Đang mượn'),
(10, '2021-12-13 00:00:00', '2021-12-16 00:00:00', 'MS004', 'TTV004', 'NV01', '', 'Đang mượn'),
(11, '2021-12-13 00:00:00', '2021-12-16 00:00:00', 'MS01', 'TTV004', 'NV01', '', 'Đã trả');

-- --------------------------------------------------------

--
-- Table structure for table `return_detail`
--

CREATE TABLE `return_detail` (
  `id_return_detail` int(11) NOT NULL,
  `id_rental_detail` int(11) NOT NULL,
  `expected_return_date` datetime DEFAULT NULL,
  `actually_return_date` datetime DEFAULT NULL,
  `id_book` varchar(10) NOT NULL,
  `reader` varchar(100) NOT NULL,
  `id_lib_card` varchar(10) NOT NULL,
  `days_overdue` int(11) DEFAULT NULL,
  `id_staff` varchar(10) NOT NULL,
  `status` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `return_detail`
--

INSERT INTO `return_detail` (`id_return_detail`, `id_rental_detail`, `expected_return_date`, `actually_return_date`, `id_book`, `reader`, `id_lib_card`, `days_overdue`, `id_staff`, `status`) VALUES
(10, 6, '2021-12-16 00:00:00', '2021-12-13 00:00:00', 'MS003', 'Thư Huỳnh Thị Ngọc', 'TTV001', 0, 'NV01', ''),
(11, 11, '2021-12-16 00:00:00', '2021-12-13 00:00:00', 'MS01', 'My Phạm', 'TTV004', 0, 'NV01', '');

-- --------------------------------------------------------

--
-- Table structure for table `staffs`
--

CREATE TABLE `staffs` (
  `id_staff` varchar(10) NOT NULL,
  `firstname` varchar(50) NOT NULL,
  `lastname` varchar(50) NOT NULL,
  `address` varchar(100) DEFAULT NULL,
  `phone_number` varchar(45) DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `pid` varchar(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `staffs`
--

INSERT INTO `staffs` (`id_staff`, `firstname`, `lastname`, `address`, `phone_number`, `birthday`, `pid`) VALUES
('NV01', 'Thu', 'Huynh Thi Ngoc', 'Thu Duc', '123456789', '2001-04-17', '12345567444'),
('NV02', 'Son', 'Nguyen Thai', 'Quan 9', '123456789', '2000-11-05', '12345'),
('NV03', 'Ngoc', 'Bui Hong', 'Thu Duc', '123456789', '2002-11-05', '1234576768');

-- --------------------------------------------------------

--
-- Table structure for table `suppliers`
--

CREATE TABLE `suppliers` (
  `id_supplier` varchar(10) NOT NULL,
  `supplier_name` varchar(45) NOT NULL,
  `address` varchar(45) DEFAULT NULL,
  `phone_number` varchar(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `suppliers`
--

INSERT INTO `suppliers` (`id_supplier`, `supplier_name`, `address`, `phone_number`) VALUES
('NCC01', 'Nhà sách Fahasa', '53 Võ Văn Ngân, Linh Chiểu, Thủ Đức', '123456789'),
('NCC02', 'Nhà sách Nhã Nam', '50 Lê Văn Việt, phường Hiệp Phú, tp.Thủ Đức', '123456789'),
('NCC03', 'Nhà sách Phương Nam', '50 Lê Văn Việt, phường Hiệp Phú, tp.Thủ Đức', '1234567891');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id_user` varchar(20) NOT NULL,
  `username` varchar(45) NOT NULL,
  `password` varchar(45) DEFAULT NULL,
  `role` varchar(45) DEFAULT NULL,
  `id_staff` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id_user`, `username`, `password`, `role`, `id_staff`) VALUES
('TK01', 'ngocthu1704', '12345', 'ThuKho', 'NV01'),
('TK02', 'thaison2k', '12345', 'NhanVien', 'NV02'),
('TK03', 'bhnruy', '12345', 'NhanVien', 'NV03');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `authors`
--
ALTER TABLE `authors`
  ADD PRIMARY KEY (`id_author`);

--
-- Indexes for table `books`
--
ALTER TABLE `books`
  ADD PRIMARY KEY (`id_book`),
  ADD KEY `fk_books_authors1_idx` (`id_author`),
  ADD KEY `fk_books_publishers1_idx` (`id_publisher`),
  ADD KEY `fk_books_categories1_idx` (`id_category`),
  ADD KEY `fk_books_languges1_idx` (`id_language`),
  ADD KEY `location` (`location`);

--
-- Indexes for table `categories`
--
ALTER TABLE `categories`
  ADD PRIMARY KEY (`id_category`);

--
-- Indexes for table `idv_detail`
--
ALTER TABLE `idv_detail`
  ADD PRIMARY KEY (`id_idv_detail`),
  ADD KEY `fk_idv_detail_inv_deli_voucher1_idx` (`id_idv`),
  ADD KEY `fk_idv_detail_books1_idx` (`id_book`);

--
-- Indexes for table `inv_deli_voucher`
--
ALTER TABLE `inv_deli_voucher`
  ADD PRIMARY KEY (`id_idv`),
  ADD KEY `fk_inv_deli_voucher_suppliers1_idx` (`id_supplier`);

--
-- Indexes for table `languages`
--
ALTER TABLE `languages`
  ADD PRIMARY KEY (`id_language`);

--
-- Indexes for table `member_card`
--
ALTER TABLE `member_card`
  ADD PRIMARY KEY (`id_lib_card`),
  ADD KEY `fk_member_card_staffs1_idx` (`id_staff`),
  ADD KEY `fk_member_card_readers1_idx` (`id_reader`);

--
-- Indexes for table `publishers`
--
ALTER TABLE `publishers`
  ADD PRIMARY KEY (`id_publisher`);

--
-- Indexes for table `readers`
--
ALTER TABLE `readers`
  ADD PRIMARY KEY (`id_reader`),
  ADD KEY `reader_type` (`reader_type`);

--
-- Indexes for table `reader_type`
--
ALTER TABLE `reader_type`
  ADD PRIMARY KEY (`type_id`);

--
-- Indexes for table `reason`
--
ALTER TABLE `reason`
  ADD PRIMARY KEY (`id_reason`);

--
-- Indexes for table `receipt`
--
ALTER TABLE `receipt`
  ADD PRIMARY KEY (`id_receipt`),
  ADD KEY `fk_receipt_reason_idx` (`reason`);

--
-- Indexes for table `rental_detail`
--
ALTER TABLE `rental_detail`
  ADD PRIMARY KEY (`id_rental_detail`),
  ADD KEY `fk_rental_detail_books1_idx` (`id_book`),
  ADD KEY `fk_rental_detail_member_card1_idx` (`id_lib_card`),
  ADD KEY `fk_rental_detail_staff_idx` (`id_staff`);

--
-- Indexes for table `return_detail`
--
ALTER TABLE `return_detail`
  ADD PRIMARY KEY (`id_return_detail`),
  ADD KEY `fk_return_detail_books1_idx` (`id_book`),
  ADD KEY `fk_return_detail_staffs1_idx` (`id_staff`),
  ADD KEY `fk_return_detail_member_card1_idx` (`id_lib_card`);

--
-- Indexes for table `staffs`
--
ALTER TABLE `staffs`
  ADD PRIMARY KEY (`id_staff`);

--
-- Indexes for table `suppliers`
--
ALTER TABLE `suppliers`
  ADD PRIMARY KEY (`id_supplier`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id_user`),
  ADD KEY `fk_users_staffs1_idx` (`id_staff`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `reader_type`
--
ALTER TABLE `reader_type`
  MODIFY `type_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `rental_detail`
--
ALTER TABLE `rental_detail`
  MODIFY `id_rental_detail` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT for table `return_detail`
--
ALTER TABLE `return_detail`
  MODIFY `id_return_detail` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `books`
--
ALTER TABLE `books`
  ADD CONSTRAINT `fk_books_authors1` FOREIGN KEY (`id_author`) REFERENCES `authors` (`id_author`) ON DELETE SET NULL ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_books_categories1` FOREIGN KEY (`id_category`) REFERENCES `categories` (`id_category`) ON DELETE SET NULL ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_books_languges1` FOREIGN KEY (`id_language`) REFERENCES `languages` (`id_language`) ON DELETE SET NULL ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_books_publishers1` FOREIGN KEY (`id_publisher`) REFERENCES `publishers` (`id_publisher`) ON DELETE SET NULL ON UPDATE CASCADE;

--
-- Constraints for table `idv_detail`
--
ALTER TABLE `idv_detail`
  ADD CONSTRAINT `fk_idv_detail_books1` FOREIGN KEY (`id_book`) REFERENCES `books` (`id_book`) ON DELETE NO ACTION ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_idv_detail_inv_deli_voucher1` FOREIGN KEY (`id_idv`) REFERENCES `inv_deli_voucher` (`id_idv`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `inv_deli_voucher`
--
ALTER TABLE `inv_deli_voucher`
  ADD CONSTRAINT `fk_inv_deli_voucher_suppliers1` FOREIGN KEY (`id_supplier`) REFERENCES `suppliers` (`id_supplier`) ON DELETE NO ACTION ON UPDATE CASCADE;

--
-- Constraints for table `member_card`
--
ALTER TABLE `member_card`
  ADD CONSTRAINT `fk_member_card_readers1` FOREIGN KEY (`id_reader`) REFERENCES `readers` (`id_reader`) ON DELETE NO ACTION ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_member_card_staffs1` FOREIGN KEY (`id_staff`) REFERENCES `staffs` (`id_staff`) ON DELETE NO ACTION ON UPDATE CASCADE;

--
-- Constraints for table `readers`
--
ALTER TABLE `readers`
  ADD CONSTRAINT `readers_ibfk_1` FOREIGN KEY (`reader_type`) REFERENCES `reader_type` (`type_id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `receipt`
--
ALTER TABLE `receipt`
  ADD CONSTRAINT `fk_receipt_reason` FOREIGN KEY (`reason`) REFERENCES `reason` (`id_reason`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `rental_detail`
--
ALTER TABLE `rental_detail`
  ADD CONSTRAINT `fk_rental_detail_books1` FOREIGN KEY (`id_book`) REFERENCES `books` (`id_book`) ON DELETE NO ACTION ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_rental_detail_member_card1` FOREIGN KEY (`id_lib_card`) REFERENCES `member_card` (`id_lib_card`) ON DELETE NO ACTION ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_rental_detail_staff` FOREIGN KEY (`id_staff`) REFERENCES `staffs` (`id_staff`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `return_detail`
--
ALTER TABLE `return_detail`
  ADD CONSTRAINT `fk_return_detail_books1` FOREIGN KEY (`id_book`) REFERENCES `books` (`id_book`) ON DELETE NO ACTION ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_return_detail_member_card1` FOREIGN KEY (`id_lib_card`) REFERENCES `member_card` (`id_lib_card`) ON DELETE NO ACTION ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_return_detail_staffs1` FOREIGN KEY (`id_staff`) REFERENCES `staffs` (`id_staff`) ON DELETE NO ACTION ON UPDATE CASCADE;

--
-- Constraints for table `users`
--
ALTER TABLE `users`
  ADD CONSTRAINT `fk_users_staffs1` FOREIGN KEY (`id_staff`) REFERENCES `staffs` (`id_staff`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;


/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
