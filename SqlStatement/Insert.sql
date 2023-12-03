USE HangKhong;

INSERT INTO FLIGHT (MaCB, GaDi, GaDen, DoDai, GioDi, GioDen, ChiPhi) VALUES 
('CB001', 'Hanoi', 'Ho Chi Minh', 1150, '06:00:00', '08:00:00', 30000),
('CB002', 'Da Nang', 'Nha Trang', 500, '09:00:00', '10:30:00', 20000),
('CB003', 'Ho Chi Minh', 'Hue', 900, '11:00:00', '12:50:00', 25000),
('CB004', 'Hanoi', 'Da Nang', 800, '07:00:00', '08:50:00', 22000),
('CB005', 'Can Tho', 'Phu Quoc', 300, '12:00:00', '12:45:00', 15000),
('CB006', 'Hue', 'Da Nang', 100, '13:00:00', '13:40:00', 10000),
('CB007', 'Nha Trang', 'Ho Chi Minh', 450, '14:00:00', '15:20:00', 18000),
('CB008', 'Hanoi', 'Phu Quoc', 1500, '16:00:00', '18:30:00', 35000),
('CB009', 'Da Nang', 'Hanoi', 800, '19:00:00', '20:50:00', 22000),
('CB010', 'Ho Chi Minh', 'Can Tho', 200, '20:00:00', '20:50:00', 12000),
('CB011', 'Phu Quoc', 'Hue', 1100, '21:00:00', '23:10:00', 28000),
('CB012', 'Hanoi', 'Hue', 700, '17:00:00', '18:40:00', 21000),
('CB013', 'Nha Trang', 'Hanoi', 1300, '15:00:00', '17:20:00', 31000),
('CB014', 'Da Nang', 'Ho Chi Minh', 850, '09:30:00', '11:10:00', 23000),
('CB015', 'Can Tho', 'Da Nang', 700, '10:00:00', '11:50:00', 21000);

INSERT INTO AIRPLANE (MaMB, Loai, TamBay) VALUES 
('MB001', 'Boeing 777', 7300),
('MB002', 'Airbus A320', 6150),
('MB003', 'Boeing 737', 6800),
('MB004', 'Airbus A330', 8000),
('MB005', 'Boeing 787', 7600);

INSERT INTO EMPLOYEE (MaNV, Ten, Luong) VALUES 
('NV001', 'Nguyen Van A', 20000),
('NV002', 'Tran Thi B', 18000),
('NV003', 'Le Thi C', 19000),
('NV004', 'Pham Van D', 21000),
('NV005', 'Hoang Thi E', 17000),
('NV006', 'Vu Van F', 22000),
('NV007', 'Dang Thi G', 16000),
('NV008', 'Bui Van H', 23000),
('NV009', 'Do Thi I', 20000),
('NV010', 'Ly Van K', 19000);

INSERT INTO CERTIFICATE (MaNV, MaMB) VALUES 
('NV001', 'MB001'),
('NV002', 'MB002'),
('NV003', 'MB003'),
('NV004', 'MB001'),
('NV005', 'MB002'),
('NV006', 'MB004'),
('NV007', 'MB005'),
('NV008', 'MB003'),
('NV009', 'MB004'),
('NV010', 'MB005');

