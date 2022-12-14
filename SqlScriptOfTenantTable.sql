USE [tenant]
GO

/****** Object:  Table [dbo].[tenant]    Script Date: 14-12-2022 11.11.12 AM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[tenant](
	[tenantID] [int] IDENTITY(1,1) NOT NULL,
	[Name] [nvarchar](50) NULL,
	[Rent] [nvarchar](50) NULL,
	[Email] [nvarchar](50) NULL
) ON [PRIMARY]
GO



