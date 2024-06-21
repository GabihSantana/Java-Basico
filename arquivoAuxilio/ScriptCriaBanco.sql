-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 08-Jun-2024 às 21:10
-- Versão do servidor: 10.4.22-MariaDB
-- versão do PHP: 7.4.27

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `eleicao2024`
--

DELIMITER $$
--
-- Procedimentos
--
CREATE DEFINER=`root`@`localhost` PROCEDURE `abrir_Urna` (IN `v_idUrna` INT, IN `v_dataAbertura` DATETIME, IN `v_statusUrna` VARCHAR(1))  UPDATE urna SET dataAbertura = v_dataAbertura, statusUrna = v_statusUrna
WHERE idUrna = v_idUrna$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `alterar_EleitorFKAluno` (IN `v_idEleitor` INT, IN `v_idAluno` INT)  UPDATE eleitor SET idAluno =v_idAluno WHERE idEleitor = v_idEleitor$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `alterar_EleitorFKFuncionario` (IN `v_idEleitor` INT, IN `v_idFuncionario` INT)  UPDATE eleitor SET idFuncionario = v_idFuncionario WHERE idEleitor = v_idEleitor$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `alterar_EleitorFKProfessor` (IN `v_idEleitor` INT, IN `v_idProfessor` INT)  UPDATE eleitor SET idProfessor = v_idProfessor WHERE idEleitor = v_idEleitor$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `alterar_Urna` (IN `v_idUrna` INT, IN `v_modeloUrna` VARCHAR(50), IN `v_dataAbertura` DATETIME, IN `v_dataFechamento` DATETIME, IN `v_statusUrna` VARCHAR(1), IN `v_idUsuario` INT)  UPDATE urna SET modeloUrna = v_modeloUrna, dataAbertura = v_dataAbertura, 
dataFechamento = v_dataFechamento, statusUrna = v_statusUrna, 
idUsuario = v_idUsuario
WHERE idUrna = v_idUrna$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `alterar_Usuario` (IN `v_senha` VARCHAR(60), IN `v_nome` VARCHAR(50), IN `v_cpf` VARCHAR(14), IN `v_tipo` VARCHAR(1), IN `v_ativo` VARCHAR(1), IN `v_idUsuario` INT(11))  UPDATE usuario SET senha = v_senha, nome =v_nome, cpf = v_cpf, tipo =v_tipo, ativo=v_ativo WHERE idUsuario = v_idUsuario$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `consultar_EleitorEleicao` (IN `v_idEleitor` INT(11), IN `v_idEleicao` INT(11))  SELECT 
eleitor_eleicao.idEleitorEleicao,
eleitor_eleicao.idEleitor, 
eleitor_eleicao.idEleicao, 
eleitor_eleicao.dataVoto,	
eleitor.idEleitor, 
eleitor.nomeEleitor,  
eleitor.dataCadastro 
FROM 
	eleitor_Eleicao, eleitor 
WHERE 
eleitor_eleicao.idEleicao = v_idEleicao AND 
eleitor_eleicao.idEleitor = v_idEleitor AND 
eleitor_eleicao.idEleitor = eleitor.idEleitor$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `consultar_UrnaCodUrna` (IN `v_idUrna` INT)  SELECT 
urna.idUrna,
urna.modeloUrna,
urna.dataAbertura,
urna.dataFechamento,
urna.statusUrna,
urna.idUsuario,
usuario.senha,
usuario.nome,
usuario.cpf,
usuario.tipo,
usuario.ativo
FROM 
	urna,usuario 
WHERE 
urna.idUrna = v_idUrna$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `consultar_Usuario` (IN `v_idUsuario` INT)  SELECT idUsuario, senha, nome, cpf, tipo, ativo FROM usuario 
WHERE idUsuario = v_idUsuario$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `fechar_Urna` (IN `v_idUrna` INT, IN `v_dataFechamento` DATETIME, IN `v_statusUrna` VARCHAR(1))  UPDATE urna SET dataFechamento = v_dataFechamento, statusUrna = v_statusUrna
WHERE idUrna = v_idUrna$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `inativar_Urna` (IN `v_idUrna` INT, IN `v_statusUrna` VARCHAR(1))  UPDATE urna SET statusUrna = v_statusUrna
WHERE idUrna = v_idUrna$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `inserir_Aluno` (IN `v_numProntuario` VARCHAR(50), IN `v_curso` VARCHAR(150), IN `v_statusMatricula` VARCHAR(50))  BEGIN
insert into aluno (numProntuario,curso,statusMatricula)         
    values(v_numProntuario, v_curso,v_statusMatricula);
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `Inserir_Eleicao` (IN `v_dataRealizacao` DATETIME, IN `v_statusEleicao` VARCHAR(1))  BEGIN
insert into eleicao (dataRealizacao,statusEleicao)         
    values(v_dataRealizacao,v_statusEleicao);
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `inserir_Eleitor` (IN `v_nomeEleitor` VARCHAR(255), IN `v_dataCadastro` DATETIME)  BEGIN
insert into eleitor (nomeEleitor,dataCadastro)         
    values(v_nomeEleitor, v_dataCadastro);
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `Inserir_EleitorEleicao` (IN `v_idEleitor` INT(11), IN `v_idEleicao` INT(11), IN `v_dataVoto` DATETIME)  BEGIN
insert into eleitor_Eleicao (idEleitor,idEleicao,dataVoto)         
    values(v_idEleitor,v_idEleicao, v_dataVoto);
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `inserir_Funcionario` (IN `v_numFuncional` INT, IN `v_departamento` VARCHAR(150), IN `v_cargo` VARCHAR(150), IN `v_statusAtividade` VARCHAR(50))  BEGIN
insert into funcionario (numFuncional,departamento,cargo,statusAtividade)         
    values(v_numFuncional, v_departamento,v_cargo,v_statusAtividade);
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `inserir_Professor` (IN `v_numFuncional` INT, IN `v_titulacao` VARCHAR(150), IN `v_areaAtuacao` VARCHAR(150), IN `v_statusDocencia` VARCHAR(50))  BEGIN
insert into professor (numFuncional,titulacao,areaAtuacao,statusDocencia)         
    values(v_numFuncional, v_titulacao,v_areaAtuacao,v_statusDocencia);
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `Inserir_Urna` (IN `v_modeloUrna` VARCHAR(50), IN `v_dataAbertura` DATETIME, IN `v_dataFechamento` DATETIME, IN `v_statusUrna` VARCHAR(1), IN `v_idUsuario` INT)  BEGIN
insert into urna (modeloUrna,dataAbertura,dataFechamento,statusUrna,idUsuario)         
    values(v_modeloUrna,v_dataAbertura,v_dataFechamento,v_statusUrna,v_idUsuario);
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `Inserir_Usuario` (IN `senha` VARCHAR(60), IN `nome` VARCHAR(50), IN `cpf` VARCHAR(14), IN `tipo` VARCHAR(1), IN `ativo` VARCHAR(1))  BEGIN
insert into usuario (senha,nome,cpf,tipo,ativo)         
    values(senha,nome,cpf,tipo,ativo);
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `listar_EleitorEleicao` (IN `v_idEleicao` INT)  SELECT 
eleitor_eleicao.idEleitorEleicao,
eleitor_eleicao.idEleitor, 
eleitor_eleicao.idEleicao, 
eleitor_eleicao.dataVoto,	
eleitor.idEleitor, 
eleitor.nomeEleitor,  
eleitor.dataCadastro 
FROM 
	eleitor_Eleicao, eleitor 
WHERE 
eleitor_eleicao.idEleicao = v_idEleicao AND 
eleitor_eleicao.idEleitor = eleitor.idEleitor$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `listar_UrnaDataAbertura` (IN `v_dataAbertura` DATETIME)  SELECT 
urna.idUrna,
urna.modeloUrna,
urna.dataAbertura,
urna.dataFechamento,
urna.statusUrna,
urna.idUsuario,
usuario.senha,
usuario.nome,
usuario.cpf,
usuario.tipo,
usuario.ativo
FROM 
	urna,usuario 
WHERE 
urna.dataAbertura = v_dataAbertura AND
urna.idUsuario = usuario.idUsuario$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `listar_UrnaModelo` (IN `v_modeloUrna` VARCHAR(50))  SELECT 
urna.idUrna,
urna.modeloUrna,
urna.dataAbertura,
urna.dataFechamento,
urna.statusUrna,
urna.idUsuario,
usuario.senha,
usuario.nome,
usuario.cpf,
usuario.tipo,
usuario.ativo
FROM 
	urna,usuario 
WHERE 
urna.modeloUrna = v_modeloUrna AND
urna.idUsuario = usuario.idUsuario$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `listar_UrnaModeloDataAbertura` (IN `v_modeloUrna` VARCHAR(50), `v_dataAbertura` DATETIME)  SELECT 
urna.idUrna,
urna.modeloUrna,
urna.dataAbertura,
urna.dataFechamento,
urna.statusUrna,
urna.idUsuario,
usuario.senha,
usuario.nome,
usuario.cpf,
usuario.tipo,
usuario.ativo
FROM 
	urna,usuario 
WHERE 
urna.modeloUrna = v_modeloUrna AND
urna.dataAbertura = v_dataAbertura AND
urna.idUsuario = usuario.idUsuario$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `listar_VotoEleicao` (IN `v_idEleicao` INT)  SELECT 
voto.idVoto, 
voto.dataVoto, 
voto.tipoEleitor, 
voto.VotoBranco,
voto.VotoNulo,
voto.idEleicao,
voto.idCandidatura, 
candidatura.nomeCandidato,
candidatura.pesoAluno,
candidatura.pesoProfessor,
candidatura.pesoFuncionario,
candidatura.tipoCandidatura,
voto.idUrna, 
urna.modeloUrna,
urna.dataAbertura,
urna.dataFechamento,
urna.statusUrna,
urna.idUsuario,
usuario.senha,
usuario.nome,
usuario.cpf,
usuario.tipo,
usuario.ativo
FROM 
	voto, candidatura,urna,usuario 
WHERE 
voto.idEleicao = v_idEleicao AND 
voto.idCandidatura = candidatura.idCandidatura AND
voto.idUrna = urna.idUrna AND
urna.idUsuario = usuario.idUsuario$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `selecionar_Aluno` (IN `v_idAluno` INT)  SELECT idAluno, numProntuario, curso, statusMatricula FROM aluno WHERE idAluno = v_idAluno$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `selecionar_Eleicao_Codigo` (IN `v_idEleicao` INT)  SELECT idEleicao, dataRealizacao,statusEleicao FROM eleicao WHERE idEleicao = v_idEleicao$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `selecionar_Eleicao_Status` (IN `v_statusEleicao` VARCHAR(1))  SELECT idEleicao, dataRealizacao,statusEleicao FROM eleicao WHERE statusEleicao = v_statusEleicao$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `selecionar_Eleitor` (IN `v_idEleitor` INT)  SELECT idEleitor, nomeEleitor, dataCadastro, idAluno, idProfessor, idFuncionario FROM eleitor WHERE idEleitor = v_idEleitor$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `selecionar_Funcionario` (IN `v_idFuncionario` INT)  SELECT idFuncionario, numFuncional, departamento, cargo, statusAtividade FROM funcionario WHERE idFuncionario = v_idFuncionario$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `selecionar_Professor` (IN `v_idProfessor` INT)  SELECT idProfessor, numFuncional, titulacao, areaAtuacao, statusDocencia FROM professor WHERE idProfessor = v_idProfessor$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `selecionar_Usuario` (IN `v_cpf` VARCHAR(14))  SELECT idUsuario, senha, nome, cpf, tipo, ativo FROM usuario WHERE cpf = v_cpf$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `Inserir_Voto` (IN `v_dataRealizacao` DATETIME, IN `v_statusEleicao` VARCHAR(1))  BEGIN
insert into eleicao (dataRealizacao,statusEleicao)         
    values(v_dataRealizacao,v_statusEleicao);
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `Inserir_Voto` (IN `v_dataVoto` DATETIME, IN `v_tipoEleitor` VARCHAR(1), IN `v_VotoBranco` VARCHAR(1), IN `v_VotoNulo` VARCHAR(1), 
IN `v_idCandidatura` INT, IN `v_idUrna` INT, IN `v_idEleicao` INT) BEGIN
insert into voto (dataVoto,tipoEleitor,VotoBranco,VotoNulo,idCandidatura,idUrna,idEleicao)
 values(v_dataVoto,v_tipoEleitor,v_VotoBranco,v_VotoNulo,v_idCandidatura,v_idUrna,v_idEleicao);
END$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Estrutura da tabela `aluno`
--

CREATE TABLE `aluno` (
  `idAluno` int(11) NOT NULL,
  `numProntuario` varchar(50) DEFAULT NULL,
  `curso` varchar(150) DEFAULT NULL,
  `statusMatricula` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `aluno`
--

INSERT INTO `aluno` (`idAluno`, `numProntuario`, `curso`, `statusMatricula`) VALUES
(1, '1', '1', 'Ativa');

-- --------------------------------------------------------

--
-- Estrutura da tabela `candidatura`
--

CREATE TABLE `candidatura` (
  `idCandidatura` int(11) NOT NULL,
  `nomeCandidato` varchar(50) DEFAULT NULL,
  `pesoAluno` int(11) NOT NULL,
  `pesoProfessor` int(11) NOT NULL,
  `pesoFuncionario` int(11) NOT NULL,
  `tipoCandidatura` varchar(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;


-- Extraindo dados da tabela `candidatura`
--

INSERT INTO `candidatura` (`idCandidatura`, `nomeCandidato`, `pesoAluno`, `pesoProfessor`, `pesoFuncionario`, `tipoCandidatura`) VALUES
(1, 'Branco', 1, 1, 1, 'B'),
(2, 'Nulo', 1, 1, 1, 'N'),
(10, '10', 2, 3, 4, '1'),
(20, '20', 2, 3, 4, '2');

-- --------------------------------------------------------

--
-- Estrutura da tabela `eleicao`
--

CREATE TABLE `eleicao` (
  `idEleicao` int(11) NOT NULL,
  `dataRealizacao` datetime DEFAULT NULL,
  `statusEleicao` varchar(1) DEFAULT 'F'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `eleicao`
--

INSERT INTO `eleicao` (`idEleicao`, `dataRealizacao`, `statusEleicao`) VALUES
(1, '2024-05-21 23:49:40', 'F'),
(2, '2024-05-21 23:49:40', 'F'),
(3, '2024-05-23 00:00:00', 'F'),
(4, '2024-05-24 00:00:00', 'A');

-- --------------------------------------------------------

--
-- Estrutura da tabela `eleitor`
--

CREATE TABLE `eleitor` (
  `idEleitor` int(11) NOT NULL,
  `nomeEleitor` varchar(255) DEFAULT NULL,
  `dataCadastro` datetime DEFAULT NULL,
  `idAluno` int(11) DEFAULT NULL,
  `idProfessor` int(11) DEFAULT NULL,
  `idFuncionario` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `eleitor`
--

INSERT INTO `eleitor` (`idEleitor`, `nomeEleitor`, `dataCadastro`, `idAluno`, `idProfessor`, `idFuncionario`) VALUES
(2, '1', '2024-11-05 00:00:00', 1, NULL, NULL),
(3, '2', '2024-11-05 00:00:00', NULL, NULL, NULL),
(4, '4444', '2024-11-05 00:00:00', NULL, NULL, 1),
(5, '555', '2024-11-05 00:00:00', NULL, 1, NULL);

-- --------------------------------------------------------

--
-- Estrutura da tabela `eleitor_eleicao`
--

CREATE TABLE `eleitor_eleicao` (
  `idEleitorEleicao` int(11) NOT NULL,
  `idEleitor` int(11) DEFAULT NULL,
  `idEleicao` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `funcionario`
--

CREATE TABLE `funcionario` (
  `idFuncionario` int(11) NOT NULL,
  `numFuncional` int(11) NOT NULL,
  `departamento` varchar(150) DEFAULT NULL,
  `cargo` varchar(150) DEFAULT NULL,
  `statusAtividade` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `funcionario`
--

INSERT INTO `funcionario` (`idFuncionario`, `numFuncional`, `departamento`, `cargo`, `statusAtividade`) VALUES
(1, 1, '1', '1', 'Exercicio');

-- --------------------------------------------------------

--
-- Estrutura da tabela `professor`
--

CREATE TABLE `professor` (
  `idProfessor` int(11) NOT NULL,
  `numFuncional` int(11) NOT NULL,
  `titulacao` varchar(150) DEFAULT NULL,
  `areaAtuacao` varchar(150) DEFAULT NULL,
  `statusDocencia` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `professor`
--

INSERT INTO `professor` (`idProfessor`, `numFuncional`, `titulacao`, `areaAtuacao`, `statusDocencia`) VALUES
(1, 1, '1', '1', 'Efetiva');

-- --------------------------------------------------------

--
-- Estrutura da tabela `urna`
--

CREATE TABLE `urna` (
  `idUrna` int(11) NOT NULL,
  `modeloUrna` varchar(50) DEFAULT NULL,
  `dataAbertura` datetime DEFAULT NULL,
  `dataFechamento` datetime DEFAULT NULL,
  `statusUrna` varchar(1) DEFAULT 'F',
  `idUsuario` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `urna`
--

INSERT INTO `urna` (`idUrna`, `modeloUrna`, `dataAbertura`, `dataFechamento`, `statusUrna`, `idUsuario`) VALUES
(1, '1', '2024-05-21 23:49:01', '2024-05-21 23:49:01', 'F', 1),
(2, '2', '2024-05-21 23:49:01', '2024-05-21 23:49:01', 'F', 2);

-- --------------------------------------------------------

--
-- Estrutura da tabela `usuario`
--

CREATE TABLE `usuario` (
  `idUsuario` int(11) NOT NULL,
  `senha` varchar(60) DEFAULT NULL,
  `nome` varchar(50) DEFAULT NULL,
  `cpf` varchar(14) DEFAULT NULL,
  `tipo` varchar(1) DEFAULT NULL,
  `ativo` varchar(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `usuario`
--

INSERT INTO `usuario` (`idUsuario`, `senha`, `nome`, `cpf`, `tipo`, `ativo`) VALUES
(1, '66', '66', '66', '6', '6'),
(2, '98899', '988', '88', 'M', 'S'),
(3, '44', '44', '44', '4', '4'),
(5, '111', '111', '111', 'M', 'S'),
(6, '99', '99', '99', 'M', 'S'),
(7, '357777', '357', '357', 'M', 'S');

-- --------------------------------------------------------

--
-- Estrutura da tabela `voto`
--

CREATE TABLE `voto` (
  `idVoto` int(11) NOT NULL,
  `dataVoto` datetime DEFAULT NULL,
  `tipoEleitor` varchar(1) DEFAULT NULL,
  `VotoBranco` varchar(1) DEFAULT NULL,
  `VotoNulo` varchar(1) DEFAULT NULL,
  `idCandidatura` int(11) DEFAULT NULL,
  `idUrna` int(11) DEFAULT NULL,
  `idEleicao` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `voto`
--

INSERT INTO `voto` (`idVoto`, `dataVoto`, `tipoEleitor`, `VotoBranco`, `VotoNulo`, `idCandidatura`, `idUrna`, `idEleicao`) VALUES
(1, '2024-05-21 23:50:18', 'A', NULL, NULL, 10, 1, 1),
(2, '2024-05-21 23:50:18', 'P', NULL, NULL, 20, 1, 1),
(3, '2024-05-21 23:50:18', 'A', NULL, NULL, 10, 2, 1),
(4, '2024-05-21 23:50:18', 'P', NULL, NULL, 20, 2, 1);

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `aluno`
--
ALTER TABLE `aluno`
  ADD PRIMARY KEY (`idAluno`);

--
-- Índices para tabela `candidatura`
--
ALTER TABLE `candidatura`
  ADD PRIMARY KEY (`idCandidatura`);

--
-- Índices para tabela `eleicao`
--
ALTER TABLE `eleicao`
  ADD PRIMARY KEY (`idEleicao`);

--
-- Índices para tabela `eleitor`
--
ALTER TABLE `eleitor`
  ADD PRIMARY KEY (`idEleitor`),
  ADD KEY `idAluno` (`idAluno`),
  ADD KEY `idProfessor` (`idProfessor`),
  ADD KEY `idFuncionario` (`idFuncionario`);

--
-- Índices para tabela `eleitor_eleicao`
--
ALTER TABLE `eleitor_eleicao`
  ADD PRIMARY KEY (`idEleitorEleicao`),
  ADD KEY `idEleitor` (`idEleitor`),
  ADD KEY `idEleicao` (`idEleicao`);

--
-- Índices para tabela `funcionario`
--
ALTER TABLE `funcionario`
  ADD PRIMARY KEY (`idFuncionario`);

--
-- Índices para tabela `professor`
--
ALTER TABLE `professor`
  ADD PRIMARY KEY (`idProfessor`);

--
-- Índices para tabela `urna`
--
ALTER TABLE `urna`
  ADD PRIMARY KEY (`idUrna`),
  ADD KEY `idUsuario` (`idUsuario`);

--
-- Índices para tabela `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`idUsuario`),
  ADD UNIQUE KEY `cpf` (`cpf`);

--
-- Índices para tabela `voto`
--
ALTER TABLE `voto`
  ADD PRIMARY KEY (`idVoto`),
  ADD KEY `idCandidatura` (`idCandidatura`),
  ADD KEY `idEleicao` (`idEleicao`),
  ADD KEY `idUrna` (`idUrna`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `aluno`
--
ALTER TABLE `aluno`
  MODIFY `idAluno` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de tabela `eleicao`
--
ALTER TABLE `eleicao`
  MODIFY `idEleicao` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de tabela `eleitor`
--
ALTER TABLE `eleitor`
  MODIFY `idEleitor` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de tabela `eleitor_eleicao`
--
ALTER TABLE `eleitor_eleicao`
  MODIFY `idEleitorEleicao` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `funcionario`
--
ALTER TABLE `funcionario`
  MODIFY `idFuncionario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de tabela `professor`
--
ALTER TABLE `professor`
  MODIFY `idProfessor` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de tabela `usuario`
--
ALTER TABLE `usuario`
  MODIFY `idUsuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de tabela `voto`
--
ALTER TABLE `voto`
  MODIFY `idVoto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- Restrições para despejos de tabelas
--

--
-- Limitadores para a tabela `eleitor`
--
ALTER TABLE `eleitor`
  ADD CONSTRAINT `eleitor_ibfk_1` FOREIGN KEY (`idAluno`) REFERENCES `aluno` (`idAluno`),
  ADD CONSTRAINT `eleitor_ibfk_2` FOREIGN KEY (`idProfessor`) REFERENCES `professor` (`idProfessor`),
  ADD CONSTRAINT `eleitor_ibfk_3` FOREIGN KEY (`idFuncionario`) REFERENCES `funcionario` (`idFuncionario`);

--
-- Limitadores para a tabela `eleitor_eleicao`
--
ALTER TABLE `eleitor_eleicao`
  ADD CONSTRAINT `eleitor_eleicao_ibfk_1` FOREIGN KEY (`idEleitor`) REFERENCES `eleitor` (`idEleitor`),
  ADD CONSTRAINT `eleitor_eleicao_ibfk_2` FOREIGN KEY (`idEleicao`) REFERENCES `eleicao` (`idEleicao`);

--
-- Limitadores para a tabela `urna`
--
ALTER TABLE `urna`
  ADD CONSTRAINT `urna_ibfk_1` FOREIGN KEY (`idUsuario`) REFERENCES `usuario` (`idUsuario`);

--
-- Limitadores para a tabela `voto`
--
ALTER TABLE `voto`
  ADD CONSTRAINT `voto_ibfk_1` FOREIGN KEY (`idCandidatura`) REFERENCES `candidatura` (`idCandidatura`),
  ADD CONSTRAINT `voto_ibfk_2` FOREIGN KEY (`idEleicao`) REFERENCES `eleicao` (`idEleicao`),
  ADD CONSTRAINT `voto_ibfk_3` FOREIGN KEY (`idUrna`) REFERENCES `urna` (`idUrna`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

