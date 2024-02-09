INSERT INTO tbl_questions (question_id, description, technology) VALUES
(uuid_in('c5f02721-6dc3-4fa6-b46d-6f2e8dca9c66'), 'Como criar uma classe em Java?', 'JAVA'),
(uuid_in('b0ec9e6b-721c-43c7-9432-4d0b6eb15b01'), 'Explique o conceito de polimorfismo em Java.', 'JAVA'),
(uuid_in('f85e9434-1711-4e02-9f9e-7831aa5c743a'), 'Como lidar com exceções em Java?', 'JAVA');

INSERT INTO public.tbl_alternatives (alternative_id, question_id, is_correct, description) VALUES
(uuid_in('bafdf631-6edf-482a-bda9-7dce1efb1890'), uuid_in('c5f02721-6dc3-4fa6-b46d-6f2e8dca9c66'), true, 'Usando a palavra-chave "class"'),
(uuid_in('98f6891b-5f14-4b8e-bb87-46456a2610d4'), uuid_in('c5f02721-6dc3-4fa6-b46d-6f2e8dca9c66'), false, 'Definindo uma interface em Java'),
(uuid_in('993a7d37-62a0-4040-810d-d667e3f7a891'), uuid_in('c5f02721-6dc3-4fa6-b46d-6f2e8dca9c66'), false, 'Utilizando métodos estáticos'),
(uuid_in('98bf8d0f-dc1c-4db0-b09c-94246089aa02'), uuid_in('c5f02721-6dc3-4fa6-b46d-6f2e8dca9c66'), false, 'Criando um construtor padrão');

INSERT INTO public.tbl_alternatives (alternative_id, question_id, is_correct, description) VALUES
(uuid_in('1da0f5dd-7a02-4c34-8c60-4648b55141f2'), uuid_in('b0ec9e6b-721c-43c7-9432-4d0b6eb15b01'), false, 'Herança simples'),
(uuid_in('c4fd1c23-8993-4972-92d5-b8364b78d1cf'), uuid_in('b0ec9e6b-721c-43c7-9432-4d0b6eb15b01'), false, 'Encapsulamento em Java'),
(uuid_in('9da03a4e-3c8d-4a32-87e1-9898938435c2'), uuid_in('b0ec9e6b-721c-43c7-9432-4d0b6eb15b01'), false, 'Sobrecarga de métodos'),
(uuid_in('f8e6e9b3-199b-4f0d-97ce-7e5bdc080da9'), uuid_in('b0ec9e6b-721c-43c7-9432-4d0b6eb15b01'), true, 'Capacidade de um objeto de assumir várias formas');

INSERT INTO public.tbl_alternatives (alternative_id, question_id, is_correct, description) VALUES
(uuid_in('3528a132-9c12-4c8a-aa93-9f6e813c43d1'), uuid_in('f85e9434-1711-4e02-9f9e-7831aa5c743a'), false, 'Ignorando a exceção'),
(uuid_in('d3e51a56-9b97-4bb8-9827-8bcf89f4b276'), uuid_in('f85e9434-1711-4e02-9f9e-7831aa5c743a'), true, 'Utilizando blocos try-catch'),
(uuid_in('63c0210c-2a9a-4e93-98ec-8d9f3984e2b0'), uuid_in('f85e9434-1711-4e02-9f9e-7831aa5c743a'), false, 'Declarando uma exceção sem tratamento'),
(uuid_in('e4dbf524-0a54-428a-b57c-853996fc8e19'), uuid_in('f85e9434-1711-4e02-9f9e-7831aa5c743a'), false, 'Usando a palavra-chave "finally"');


