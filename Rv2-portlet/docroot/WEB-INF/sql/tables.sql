create table tsg_Flat (
	flatId LONG not null primary key,
	tsgId LONG,
	companyId LONG,
	userId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	houseId LONG,
	ownersCnt LONG,
	tenantsCnt LONG,
	spaceCommon INTEGER,
	spaceLiving INTEGER,
	roomCnt INTEGER,
	floor INTEGER,
	number_ VARCHAR(75) null,
	addressId LONG
);

create table tsg_FlatOwner (
	id_ LONG not null primary key,
	ownerId LONG,
	tsgId LONG,
	companyId LONG,
	userId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	flatId LONG,
	fromDate DATE null,
	toDate DATE null,
	percent INTEGER,
	area INTEGER,
	shared BOOLEAN
);

create table tsg_FlatTenant (
	id_ LONG not null primary key,
	companyId LONG,
	userId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	tenantId LONG,
	flatId LONG,
	tsgId LONG,
	fromDate DATE null,
	toDate DATE null
);