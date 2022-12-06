create table tb_cidade(
	id_cidade bigint not null primary key,
	nome varchar(50) not null,
	qtd_habitantes bigint
);

insert into tb_cidade
	(id_cidade, nome, qtd_habitantes)
values
	(1, 'São Paulo', 12396372),
	(2, 'Rio de Janeiro', 1000000),
	(3, 'Fortaleza', 289000),
	(4, 'Salvador', 157456),
	(5, 'Belo Horizonte', 659888),
	(6, 'Bertioga', 120000),
	(7, 'Parnaíba', 78954),
	(8, 'Maceió', 659741),
	(9, 'Florianópolis', 354000),
	(10, 'Mogi das Cruzes', 500000),
	(11, 'Manaus', 789423);
