/*
 * DOJAH Publilc APIs
 *
 * Use Dojah to verify, onboard and manage user identity across Africa!
 *
 * The version of the OpenAPI document: 1.0.0
 * Generated by: https://konfigthis.com
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Dojah.Net.Client.OpenAPIDateConverter;

namespace Dojah.Net.Model
{
    /// <summary>
    /// GetBinResponseEntity
    /// </summary>
    [DataContract(Name = "GetBinResponse_entity")]
    public partial class GetBinResponseEntity : IEquatable<GetBinResponseEntity>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="GetBinResponseEntity" /> class.
        /// </summary>
        /// <param name="bin">bin.</param>
        /// <param name="brand">brand.</param>
        /// <param name="subBrand">subBrand.</param>
        /// <param name="countryCode">countryCode.</param>
        /// <param name="countryName">countryName.</param>
        /// <param name="cardType">cardType.</param>
        /// <param name="bank">bank.</param>
        public GetBinResponseEntity(string bin = default(string), string brand = default(string), string subBrand = default(string), string countryCode = default(string), string countryName = default(string), string cardType = default(string), string bank = default(string))
        {
            this.Bin = bin;
            this.Brand = brand;
            this.SubBrand = subBrand;
            this.CountryCode = countryCode;
            this.CountryName = countryName;
            this.CardType = cardType;
            this.Bank = bank;
        }

        /// <summary>
        /// Gets or Sets Bin
        /// </summary>
        [DataMember(Name = "bin", EmitDefaultValue = false)]
        public string Bin { get; set; }

        /// <summary>
        /// Gets or Sets Brand
        /// </summary>
        [DataMember(Name = "brand", EmitDefaultValue = false)]
        public string Brand { get; set; }

        /// <summary>
        /// Gets or Sets SubBrand
        /// </summary>
        [DataMember(Name = "sub_brand", EmitDefaultValue = false)]
        public string SubBrand { get; set; }

        /// <summary>
        /// Gets or Sets CountryCode
        /// </summary>
        [DataMember(Name = "country_code", EmitDefaultValue = false)]
        public string CountryCode { get; set; }

        /// <summary>
        /// Gets or Sets CountryName
        /// </summary>
        [DataMember(Name = "country_name", EmitDefaultValue = false)]
        public string CountryName { get; set; }

        /// <summary>
        /// Gets or Sets CardType
        /// </summary>
        [DataMember(Name = "card_type", EmitDefaultValue = false)]
        public string CardType { get; set; }

        /// <summary>
        /// Gets or Sets Bank
        /// </summary>
        [DataMember(Name = "bank", EmitDefaultValue = false)]
        public string Bank { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class GetBinResponseEntity {\n");
            sb.Append("  Bin: ").Append(Bin).Append("\n");
            sb.Append("  Brand: ").Append(Brand).Append("\n");
            sb.Append("  SubBrand: ").Append(SubBrand).Append("\n");
            sb.Append("  CountryCode: ").Append(CountryCode).Append("\n");
            sb.Append("  CountryName: ").Append(CountryName).Append("\n");
            sb.Append("  CardType: ").Append(CardType).Append("\n");
            sb.Append("  Bank: ").Append(Bank).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as GetBinResponseEntity);
        }

        /// <summary>
        /// Returns true if GetBinResponseEntity instances are equal
        /// </summary>
        /// <param name="input">Instance of GetBinResponseEntity to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(GetBinResponseEntity input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Bin == input.Bin ||
                    (this.Bin != null &&
                    this.Bin.Equals(input.Bin))
                ) && 
                (
                    this.Brand == input.Brand ||
                    (this.Brand != null &&
                    this.Brand.Equals(input.Brand))
                ) && 
                (
                    this.SubBrand == input.SubBrand ||
                    (this.SubBrand != null &&
                    this.SubBrand.Equals(input.SubBrand))
                ) && 
                (
                    this.CountryCode == input.CountryCode ||
                    (this.CountryCode != null &&
                    this.CountryCode.Equals(input.CountryCode))
                ) && 
                (
                    this.CountryName == input.CountryName ||
                    (this.CountryName != null &&
                    this.CountryName.Equals(input.CountryName))
                ) && 
                (
                    this.CardType == input.CardType ||
                    (this.CardType != null &&
                    this.CardType.Equals(input.CardType))
                ) && 
                (
                    this.Bank == input.Bank ||
                    (this.Bank != null &&
                    this.Bank.Equals(input.Bank))
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.Bin != null)
                {
                    hashCode = (hashCode * 59) + this.Bin.GetHashCode();
                }
                if (this.Brand != null)
                {
                    hashCode = (hashCode * 59) + this.Brand.GetHashCode();
                }
                if (this.SubBrand != null)
                {
                    hashCode = (hashCode * 59) + this.SubBrand.GetHashCode();
                }
                if (this.CountryCode != null)
                {
                    hashCode = (hashCode * 59) + this.CountryCode.GetHashCode();
                }
                if (this.CountryName != null)
                {
                    hashCode = (hashCode * 59) + this.CountryName.GetHashCode();
                }
                if (this.CardType != null)
                {
                    hashCode = (hashCode * 59) + this.CardType.GetHashCode();
                }
                if (this.Bank != null)
                {
                    hashCode = (hashCode * 59) + this.Bank.GetHashCode();
                }
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        public IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
