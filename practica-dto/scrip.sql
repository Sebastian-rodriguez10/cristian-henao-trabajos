create database practica_dto;
use practica_dto;

create table student(
id int auto_increment primary key,
document varchar(10),
name varchar (40),
telephone varchar(10),
password varchar(20)
);

insert into student (document, name, telephone, password) values
('1000000001', 'juan perez', '3001111111', 'clave123'),
('1000000002', 'maria gomez', '3002222222', 'segura456'),
('1000000003', 'carlos lopez', '3003333333', 'pass789'),
('1000000004', 'laura rojas', '3004444444', 'admin123'),
('1000000005', 'andres martinez', '3005555555', 'usuario456'),
('1000000006', 'sofia ramirez', '3006666666', 'spring789'),
('1000000007', 'daniel castro', '3007777777', 'java123');
