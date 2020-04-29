create index IX_3B661E9 on FavouritesList_Favourite (assetEntryId);
create index IX_3BA3CC10 on FavouritesList_Favourite (companyId);
create index IX_94F071D on FavouritesList_Favourite (groupId, assetEntryId, userId);
create index IX_331EBCCC on FavouritesList_Favourite (groupId, userId);
create index IX_3022D952 on FavouritesList_Favourite (userId);
create index IX_4023850C on FavouritesList_Favourite (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_9AA1DE8E on FavouritesList_Favourite (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_682A1AF8 on FavouritesList_Favourites (assetEntryId);
create index IX_C1164561 on FavouritesList_Favourites (companyId);
create index IX_7FDE49A1 on FavouritesList_Favourites (userId);
create index IX_62E61E9B on FavouritesList_Favourites (uuid_[$COLUMN_LENGTH:75$], companyId);

create index IX_8080AB36 on FavouritesList_FavouritesList (assetEntryId);
create index IX_336DCDE3 on FavouritesList_FavouritesList (companyId);
create index IX_FF7D605F on FavouritesList_FavouritesList (userId);
create index IX_50DE5FD9 on FavouritesList_FavouritesList (uuid_[$COLUMN_LENGTH:75$], companyId);