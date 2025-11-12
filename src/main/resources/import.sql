-- Company
INSERT INTO USERS (ID, USER_TYPE, EMAIL, LOGIN, SENHA) VALUES ('550e8400-e29b-41d4-a716-446655440001', 'COMPANY', 'contato@techsolutions.com.br', 'techsolutions', '$2a$10$abcdefghijklmnopqrstuv');
INSERT INTO USERS (ID, USER_TYPE, EMAIL, LOGIN, SENHA) VALUES ('550e8400-e29b-41d4-a716-446655440002', 'COMPANY', 'rh@inovacorp.com.br', 'inovacorp', '$2a$10$wxyzabcdefghijklmnopqr');
INSERT INTO USERS (ID, USER_TYPE, EMAIL, LOGIN, SENHA) VALUES ('550e8400-e29b-41d4-a716-446655440004', 'COMPANY', 'empresa004@email.com', 'empresa004', '$2a$10$abcdefghijklmnopqrstuv');

-- Freelancers
INSERT INTO USERS (ID, USER_TYPE, EMAIL, LOGIN, SENHA)VALUES ('550e8400-e29b-41d4-a716-446655440011', 'FREELANCER', 'ana.silva@email.com', 'anasilva', '$2a$10$abcdefghijklmnopqrstuv');
INSERT INTO USERS (ID, USER_TYPE, EMAIL, LOGIN, SENHA)VALUES ('550e8400-e29b-41d4-a716-446655440012', 'FREELANCER', 'carlos.santos@email.com', 'carlossantos', '$2a$10$bcdefghijklmnopqrstuvw');
INSERT INTO USERS (ID, USER_TYPE, EMAIL, LOGIN, SENHA)VALUES ('550e8400-e29b-41d4-a716-446655440016', 'FREELANCER', 'rafael.dev@email.com', 'rafaeldev', '$2a$10$cdefghijklmnopqrstuvwx');

-- ============================================
-- 2. INSERINDO EMPRESAS (COMPANIES)
-- ============================================
INSERT INTO COMPANIES (ID, CNPJ) VALUES('550e8400-e29b-41d4-a716-446655440001', '12.345.678/0001-90');
INSERT INTO COMPANIES (ID, CNPJ) VALUES('550e8400-e29b-41d4-a716-446655440002', '23.456.789/0001-01');
INSERT INTO COMPANIES (ID, CNPJ) VALUES('550e8400-e29b-41d4-a716-446655440004', '34.567.890/0001-12');

-- ============================================
-- 3. INSERINDO FREELANCERS (FREELANCERS)
-- ============================================

INSERT INTO FREELANCERS (ID, CPF) VALUES('550e8400-e29b-41d4-a716-446655440011', '123.456.789-01');
INSERT INTO FREELANCERS (ID, CPF) VALUES('550e8400-e29b-41d4-a716-446655440012', '234.567.890-12');
INSERT INTO FREELANCERS (ID, CPF) VALUES('550e8400-e29b-41d4-a716-446655440016', '345.678.901-23');

-- ============================================
-- INSERINDO MENSAGENS (MESSAGES)
-- ============================================

INSERT INTO MESSAGES (ID, ID_USER_FROM, ID_USER_TO, MESSAGE, PROJECT) VALUES('550e8400-e29b-41d4-a716-446655440001', '550e8400-e29b-41d4-a716-446655440001', '550e8400-e29b-41d4-a716-446655440001', 'Olá! Vi o projeto de redesign do website e me interessei muito. Tenho 8 anos de experiência em UI/UX e já trabalhei com várias empresas de tecnologia. Gostaria de agendar uma reunião para discutir o projeto em detalhes.', '660e8400-e29b-41d4-a716-446655440101');
INSERT INTO MESSAGES (ID, ID_USER_FROM, ID_USER_TO, MESSAGE, PROJECT) VALUES('770e8400-e29b-41d4-a716-446655440202', '550e8400-e29b-41d4-a716-446655440001', '550e8400-e29b-41d4-a716-446655440011', 'Olá Ana! Obrigado pelo interesse. Seu portfólio é excelente! Podemos marcar uma call amanhã às 14h? Quero entender melhor sua abordagem para o projeto.', '660e8400-e29b-41d4-a716-446655440101');
INSERT INTO MESSAGES (ID, ID_USER_FROM, ID_USER_TO, MESSAGE, PROJECT) VALUES('770e8400-e29b-41d4-a716-446655440203', '550e8400-e29b-41d4-a716-446655440011', '550e8400-e29b-41d4-a716-446655440001', 'Perfeito! Estarei disponível às 14h. Vou preparar algumas referências e um briefing inicial. Qual plataforma prefere para a reunião? Teams ou Google Meet?', '660e8400-e29b-41d4-a716-446655440101');
INSERT INTO MESSAGES (ID, ID_USER_FROM, ID_USER_TO, MESSAGE, PROJECT) VALUES('770e8400-e29b-41d4-a716-446655440204', '550e8400-e29b-41d4-a716-446655440016', '550e8400-e29b-41d4-a716-446655440004', 'Bom dia! Sou desenvolvedor mobile especializado em Flutter e tenho interesse no projeto de app de delivery. Já desenvolvi 3 aplicativos similares. Posso enviar referências dos trabalhos anteriores?', '660e8400-e29b-41d4-a716-446655440102');
INSERT INTO MESSAGES (ID, ID_USER_FROM, ID_USER_TO, MESSAGE, PROJECT) VALUES('770e8400-e29b-41d4-a716-446655440205', '550e8400-e29b-41d4-a716-446655440004', '550e8400-e29b-41d4-a716-446655440016', 'Olá Rafael! Sim, por favor envie as referências. Também gostaria de saber qual sua estimativa de prazo e se você trabalha com equipe ou solo.', '660e8400-e29b-41d4-a716-446655440102');

-- ============================================
-- INSERINDO PROJETOS (FLYOVER)
-- ============================================

INSERT INTO FLYOVER (CREATE_DATE, DATE_EXPIRE, ID, BUDGET, CATEGORY, COMPANY, DESCRIPTION, EMAIL, STATUS, TITLE) VALUES('2025-10-15', '2025-12-15', '660e8400-e29b-41d4-a716-446655440101', 15000.00, 'Design','550e8400-e29b-41d4-a716-446655440001', 'Precisamos de um redesign completo do nosso website institucional. O site deve ser moderno, responsivo e com foco em conversão. Esperamos um design clean e profissional que reflita nossa identidade corporativa.','projetos@techsolutions.com.br','OPEN','Redesign de Website Corporativo');
INSERT INTO FLYOVER (CREATE_DATE, DATE_EXPIRE, ID, BUDGET, CATEGORY, COMPANY, DESCRIPTION, EMAIL, STATUS, TITLE) VALUES('2025-09-20', '2025-12-31', '660e8400-e29b-41d4-a716-446655440102', 45000.00, 'Desenvolvimento', '550e8400-e29b-41d4-a716-446655440004', 'Buscamos desenvolvedor para criar um aplicativo de delivery completo, com sistema de pedidos, pagamento online, rastreamento em tempo real e painel administrativo. Plataformas: iOS e Android.', 'dev@startupxyz.com.br', 'IN_PROGRESS', 'Desenvolvimento de App Mobile para Delivery');
INSERT INTO FLYOVER (CREATE_DATE, DATE_EXPIRE, ID, BUDGET, CATEGORY, COMPANY, DESCRIPTION, EMAIL, STATUS, TITLE) VALUES('2025-10-20', '2025-11-30', '660e8400-e29b-41d4-a716-446655440103', 8000.00, 'Design', '550e8400-e29b-41d4-a716-446655440003', 'Startup em fase de lançamento precisa de identidade visual completa: logotipo, paleta de cores, tipografia, manual de marca e aplicações em diversos materiais (cartão de visita, papel timbrado, etc).', 'projetos@designstudio.com.br', 'OPEN', 'Criação de Identidade Visual Completa');