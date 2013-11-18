create index IX_C3578AE9 on tsg_Flat (addressId);
create index IX_6592F215 on tsg_Flat (houseId);
create index IX_E6CEBF88 on tsg_Flat (roomCnt);
create index IX_F2E48ABD on tsg_Flat (tsgId);

create index IX_3222AD15 on tsg_FlatOwner (ownerId);
create index IX_157B6B34 on tsg_FlatOwner (tsgId, ownerId);

create index IX_33088AA8 on tsg_FlatTenant (flatId);
create index IX_7AA27AD9 on tsg_FlatTenant (tenantId);
create index IX_92CB29FA on tsg_FlatTenant (tenantId, tsgId);