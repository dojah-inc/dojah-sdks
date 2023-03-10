/*
 * DOJAH APIs
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
    /// GetBasicCacResponseEntity
    /// </summary>
    [DataContract(Name = "GetBasicCacResponse_entity")]
    public partial class GetBasicCacResponseEntity : IEquatable<GetBasicCacResponseEntity>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="GetBasicCacResponseEntity" /> class.
        /// </summary>
        /// <param name="rcNumber">rcNumber.</param>
        /// <param name="companyName">companyName.</param>
        /// <param name="address">address.</param>
        /// <param name="dateOfRegistration">dateOfRegistration.</param>
        /// <param name="typeOfCompany">typeOfCompany.</param>
        public GetBasicCacResponseEntity(string rcNumber = default(string), string companyName = default(string), string address = default(string), string dateOfRegistration = default(string), string typeOfCompany = default(string))
        {
            this.RcNumber = rcNumber;
            this.CompanyName = companyName;
            this.Address = address;
            this.DateOfRegistration = dateOfRegistration;
            this.TypeOfCompany = typeOfCompany;
        }

        /// <summary>
        /// Gets or Sets RcNumber
        /// </summary>
        [DataMember(Name = "rc_number", EmitDefaultValue = false)]
        public string RcNumber { get; set; }

        /// <summary>
        /// Gets or Sets CompanyName
        /// </summary>
        [DataMember(Name = "company_name", EmitDefaultValue = false)]
        public string CompanyName { get; set; }

        /// <summary>
        /// Gets or Sets Address
        /// </summary>
        [DataMember(Name = "address", EmitDefaultValue = false)]
        public string Address { get; set; }

        /// <summary>
        /// Gets or Sets DateOfRegistration
        /// </summary>
        [DataMember(Name = "date_of_registration", EmitDefaultValue = false)]
        public string DateOfRegistration { get; set; }

        /// <summary>
        /// Gets or Sets TypeOfCompany
        /// </summary>
        [DataMember(Name = "type_of_company", EmitDefaultValue = false)]
        public string TypeOfCompany { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class GetBasicCacResponseEntity {\n");
            sb.Append("  RcNumber: ").Append(RcNumber).Append("\n");
            sb.Append("  CompanyName: ").Append(CompanyName).Append("\n");
            sb.Append("  Address: ").Append(Address).Append("\n");
            sb.Append("  DateOfRegistration: ").Append(DateOfRegistration).Append("\n");
            sb.Append("  TypeOfCompany: ").Append(TypeOfCompany).Append("\n");
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
            return this.Equals(input as GetBasicCacResponseEntity);
        }

        /// <summary>
        /// Returns true if GetBasicCacResponseEntity instances are equal
        /// </summary>
        /// <param name="input">Instance of GetBasicCacResponseEntity to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(GetBasicCacResponseEntity input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.RcNumber == input.RcNumber ||
                    (this.RcNumber != null &&
                    this.RcNumber.Equals(input.RcNumber))
                ) && 
                (
                    this.CompanyName == input.CompanyName ||
                    (this.CompanyName != null &&
                    this.CompanyName.Equals(input.CompanyName))
                ) && 
                (
                    this.Address == input.Address ||
                    (this.Address != null &&
                    this.Address.Equals(input.Address))
                ) && 
                (
                    this.DateOfRegistration == input.DateOfRegistration ||
                    (this.DateOfRegistration != null &&
                    this.DateOfRegistration.Equals(input.DateOfRegistration))
                ) && 
                (
                    this.TypeOfCompany == input.TypeOfCompany ||
                    (this.TypeOfCompany != null &&
                    this.TypeOfCompany.Equals(input.TypeOfCompany))
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
                if (this.RcNumber != null)
                {
                    hashCode = (hashCode * 59) + this.RcNumber.GetHashCode();
                }
                if (this.CompanyName != null)
                {
                    hashCode = (hashCode * 59) + this.CompanyName.GetHashCode();
                }
                if (this.Address != null)
                {
                    hashCode = (hashCode * 59) + this.Address.GetHashCode();
                }
                if (this.DateOfRegistration != null)
                {
                    hashCode = (hashCode * 59) + this.DateOfRegistration.GetHashCode();
                }
                if (this.TypeOfCompany != null)
                {
                    hashCode = (hashCode * 59) + this.TypeOfCompany.GetHashCode();
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