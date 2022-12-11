package com.cstef.meshlink.db.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "devices")
data class Device(
  @PrimaryKey val userId: String,
  @ColumnInfo(name = "address") val address: String,
  @ColumnInfo(name = "rssi") val rssi: Int = 0,
  @ColumnInfo(name = "last_seen") val lastSeen: Long,
  @ColumnInfo(name = "connected") val connected: Boolean,
  @ColumnInfo(name = "name") val name: String? = null,
  @ColumnInfo(name = "blocked") val blocked: Boolean = false,
  @ColumnInfo(name = "public_key") val publicKey: String? = null,
)
